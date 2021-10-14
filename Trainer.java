import java.awt.Point;
import java.util.ArrayList;
import java.awt.Point;

public class trainer extends Entity{ //FIXME
    private String name; //not listed on UML, inherited from entity probs
    private int money;
    private int potions;
    private int pokeballs;
    private Point loc;
    private Map map;
    private ArrayList<Pokemon> pokemon;

public trainer(String n, Pokemon p, Map m) { //FIXME, super? //maxHp 25
    name = n;
    pokemon.add(p); //pokemon
    map = m;
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

public void usePotion(int pokeIndex) { //pokeIndex = loc in arraylist of pokemon the user wants to heal w/ potions
    potions -= pokeIndex; //FIXME
    //Pokemon.heal(); //set the pokemon's hp to it's maxHp
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
    if (pokeballs > 0) {
        //get hp & maxHp of pokemon
        //use hp to calc likelihood of it being caught
        //randomize to determine if successful
        //add pokemon to user's list of pokemon
        return true;
    }
    return false; //if unsuccessful capture
}

public Point getLocation() { //return where * is on map
    return loc; 
}

public char goNorth() {
    //loc change 
    if (getCharAt(locabove).equals('x')) { //invalid, returns default value that represents outofbounds, display 'hey u out of bounds'
        return 'x';
    }
    loc = getLocation(above); //update trainer loc
    return 'n'; //tf is this - ask, do i just return what getCharAt is returning?? yes, return the char at that location
}

public char goSouth() {
    //loc change
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

public Pokemon getPokemon(int index) { //rip get help, how to deal with abstract pokemon class - or not
    return pokemon.get(index);
}

public String getPokemonList() {
    return "hello world";
}

public String toString() {
    return name + " HP: " + "\nMoney: " + "\nPotions: " + "\nPoke Balls: ";
}

}