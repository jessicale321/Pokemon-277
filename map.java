import java.awt.Point;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Map {

    private char[][] map;
    private boolean[][] revealed;

    public Map() {
        map = new char[5][5];
        revealed = new boolean[5][5]; 
        for(int i = 0; i < revealed.length; i++)
            for(int j = 0; j < revealed[i].length; j++)
                 revealed[i][j] = false;
    }

    public void loadMap(int mapNum) {
        ArrayList<ArrayList<Character>> collection = new ArrayList<ArrayList<Character>>();
        try {
            String area = "Area"+mapNum+".txt";
            Scanner s = new Scanner(new File(area));
            while (s.hasNextLine()) {
                String data = s.nextLine(); //reading data line by line from file
                data = data.replaceAll("\\s", "");
                collection.add(toChar(data));
            }
        }catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        }
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map.length; col++) {
                map[row][col] = collection.get(row).get(col);
            }
        }            
    }
    public ArrayList<Character> toChar(String data) {
        ArrayList<Character> listOfchars = new ArrayList<>();
        for (int i = 0; i < data.length(); i++) {
            listOfchars.add(data.charAt(i));
        }
        return listOfchars;
    }
    public char getCharAtLoc(Point p){
        if (p.x <0 || p.y < 0 || p.x > 5 || p.y > 5 ){
            return 'x';
        }
        return map[p.x][p.y];
    }

    public String maptoString(Point p) {
        findStart();
        int x = p.x;
        int y = p.y;

        for (int i = 0; i < initialMap.length; i++) {
            for (int j = 0; j < initialMap[i].length; j++) {
                initialMap[i][j] = 'x';
            }
        }
        initialMap[x][y] = '*';
        reveal(p);

        String lineSeparator = System.lineSeparator();
        StringBuilder sb = new StringBuilder();

        // converting to string
        for (char[] row : initialMap) {
            sb.append(Arrays.toString(row)).append(lineSeparator);
        }
        String initialMapString = sb.toString();
        //removing '[' and ','
        initialMapString = initialMapString.replaceAll("[\\[\\]\\,]", "");
        return initialMapString;
    }
    

    public Point findStart() {

        Point point = new Point();
        for (int i = 0; i < map.length; i++) {
            if (map[0][i] == 's') {
                System.out.println(new Point(0, i));
                point.x = 0;
                point.y = i;
                return point;
            }

            if (map[map.length - 1][i] == 's') {
                point.x = map.length - 1;
                point.y = i;
                return point;

            }

        }
        for (int i = 0; i < map.length; i++) {
            if (map[i][0] == 's') {
                point.x = i;
                point.y = 0;
                return point;
            }

            if (map[i][map.length - 1] == 's') {
                point.x = i;
                point.y = 0;
                return point;

            }

        }

        for (int i = 1; i < map.length - 1; i++) {
            for (int j = 1; j < map.length - 1; j++) {
                if (map[i][j] == 's') {
                    point.x = i;
                    point.y = j;
                    return point;
                }

            }
        }
        //if not found
        throw new RuntimeException("Starting Point could not be found!");
    }

    public void reveal(Point p) {
        int i = p.x;
        int j = p.y;

        if (revealed[i][j] == false) {
            initialMap[i][j] = map[i][j];
            revealed[i][j] = true;
        }
    }
    public void removeCharAtLoc(Point p){
         map[p.x][p.y] = 'x';
    }
}

