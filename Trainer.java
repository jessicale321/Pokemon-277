public class Trainer { //FIXME
    private String name; //not listed on UML
    private int money;
    private int potions;
    private int pokeballs;
//    private Point loc;
//    private Map map;
//    private ArrayList<Pokemon> pokemon;

public Trainer(String n, Pokemon p, Map m) { //FIXME
    name = n;
    //pokemon
    //map
}

public int getMoney() {
    return 1; //FIXME
}

public boolean spendMoney(int amt) {
    return false;  //FIXME
}

public void receiveMoney(int amt) {
    money += amt;
}

public boolean hasPotion() {
    return false; //FIXME
}

public void receivePotion() {
    int x = 1 + 1; //FIXME
}

public void usePotion(int pokeIndex) {
    int x = 1 + 1; //FIXME
}

public boolean hasPokeball() {
    return false; //FIXME
}

public void receivePokeball() {
    int x = 1;
}

public boolean catchPokemon(Pokemon p) {
    return false;
}

public Point getLocation() {
    return false;
}

public char goNorth() {
    return 'n';
}

public char goSouth() {
    return 's';
}

public char goEast() {
    return 'e';
}

public char goWest() {
    return 'w';
}

public int getNumPokemon() {
    return 1;
}

public void healAllPokemon() {
    int x = 1;
}

public Pokemon getPokemon(int index) {
    int x = 1;
}

public String getPokemonList() {
    return "hello world";
}

public String toString() {
    return name;
}

}