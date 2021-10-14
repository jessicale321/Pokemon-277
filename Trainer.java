import java.awt.Point;
import java.util.ArrayList;
import java.awt.Point;

public class trainer extends Entity{ //FIXME
    private int money;
    private int potions;
    private int pokeballs;
    private Point loc;
    private Map map;
    private ArrayList<Pokemon> pokemon;

public Trainer(String n, Pokemon p, Map m) { //FIXME, super? //maxHp 25
    super(n);
    mHp = 25;
    money = 1000;
    potions = 2;
    pokeballs = 4;
    //loc
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
    Pokemon pokemonToHeal = pokemon.get(pokeIndex);
    pokemonToHeal.heal();
    potions -= pokeIndex; //how will they choose which pokemon to heal
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
        p.getHp();
        
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

public char goNorth() { //check curr pos, make sure desired move is valid, then update loc of trainer
    //loc change 
    if (getCharAt(locabove).equals('x')) { //invalid, returns default value that represents outofbounds, display 'hey u out of bounds'
        return 'x';
    } //in main, we need to receive an update that says they can't go that way, perhaps pick 'B', when main receives that, it will display error message
    loc = getLocation(above); //update trainer loc
    return 'n'; //tf is this - ask, do i just return what getCharAt is returning?? yes, return the char at that location
} //translate(int, int)
//if their x !> 1, return B
//in main if receive 'B', display error message

public char goSouth() {
    //loc change
    return 's';
}

public char goEast() {
    return 'e';
}

//loc.translate(int, int) <- how much you need to change the position
//either +1 or -1 depending on their direction
//return character of the new loc they're going to
//before attempting loc.translate, check if move is valid
//can use current loc and check if x pos is >= 1, if not, don't allow to move west
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

public String getPokemonList() { //use in main when they come across wild pokemon, if they choose to fight, they will choose pokemon from this list
    return "hello world"; //ask "what pokemon you want to use"
}

public String toString() {
    return name + " HP: " + "\nMoney: " + "\nPotions: " + "\nPoke Balls: ";
}

}