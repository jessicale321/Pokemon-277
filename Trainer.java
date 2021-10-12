public class trainer extends Entity{ //FIXME
    private String name; //not listed on UML
    private int money;
    private int potions;
    private int pokeballs;
//    private Point loc;
//    private Map map;
//    private ArrayList<Pokemon> pokemon;

public trainer(String n, Pokemon p, Map m) { //FIXME
    name = n;
    //pokemon.add(p); //pokemon
    //map
}

public int getMoney() {
    return money;
}

public boolean spendMoney(int amt) {
    if (money >= amt) {
        money -= amt;
        return true;
    }
    else {
        return false;
    }
}

public void receiveMoney(int amt) {
    money += amt;
}

public boolean hasPotion() {
    if (potions > 0) {
        return true;
    }
    else {
        return false;
    }
}

public void receivePotion() {
    potions += 1;
}

public void usePotion(int pokeIndex) {
    potions -= pokeIndex; //FIXME
}

public boolean hasPokeball() {
    if (pokeballs > 0) {
        return true;
    }
    else {
        return false;
    }
}

public void receivePokeball() {
    pokeballs += 1;
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
    return pokemon.size();
}

public void healAllPokemon() {
    int x = 1;
}

public Pokemon getPokemon(int index) {
    return Pokemon p;
}

public String getPokemonList() {
    return "hello world";
}

public String toString() {
    return name + " HP: " + "\nMoney: " + "\nPotions: " + "\nPoke Balls: ";
}

}