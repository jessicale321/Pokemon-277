import java.awt.Point;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Map {

    private char[][] map = new char[5][5];
    private boolean[][] revealed;

    public Map() {
    }

    public void loadMap() {
        ArrayList<ArrayList<Character>> collection = new ArrayList<ArrayList<Character>>();
        try {
            Scanner s = new Scanner(new File("C:\\Users\\Yisacor\\OneDrive\\Desktop\\File\\cecs 277\\Pokmon\\src\\pokemon\\Area1.txt"));
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

//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                 System.out.print(map[i][j] + " ");
//         }
//         System.out.println();
//      }             
    }
    public ArrayList<Character> toChar(String data) {
        ArrayList<Character> listOfchars = new ArrayList<>();
        for (int i = 0; i < data.length(); i++) {
            listOfchars.add(data.charAt(i));
        }
        return listOfchars;
    }
    public char getCharAtLoc(Point p){
        p.x = 1;
        p.y = 1;
        if (p.x <0 || p.y < 0 || p.x > 5 || p.y > 5 ){
            return 'x';
        }
        return map[p.x][p.y];
    }

    //public maptoString(Point p){}
    

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

    //public void reveal(Point p){}
    // public void removeCharAtLoc(Point p){}
}

