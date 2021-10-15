import java.awt.Point;
import java.util.ArrayList;
import java.awt.Point;
import java.lang.Math;

public class Trainer extends Entity{ //FIXME
    private int money;
    private int potions;
    private int pokeballs;
    private Point loc;
    private Map map;
    private ArrayList<Pokemon> pokemon;

public Trainer(String n, int mHp, Pokemon p, Map m) { 
    super(n, mHp);
    money = 1000;
    potions = 2;
    pokeballs = 4;
    pokemon.add(p);
    map = m;
    loc = map.findStart(); //mmmmm is that right?
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
    potions -= pokeIndex; //how will they choose which pokemon to heal?
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
        double percentHp = (p.getHp() / p.getMaxHp()); //what percent health pokemon is at
        double catchRate = 1 - percentHp; //chance for capturing pokemon
        double randNum = Math.random(); //generate random value
        if (randNum <= catchRate) {
            pokemon.add(p); //pokemon captured
            return true;
        }
    }
    return false; //unsuccessful capture
}

public Point getLocation() { //return where * is on map
    return loc; 
}

//go... method notes
//if their x !> 1, return B
//in main if receive 'B', display error message
//in main, we need to receive an update that says they can't go that way, perhaps pick 'B', when main receives that, it will display error message
//invalid, returns default value that represents outofbounds, display 'hey u out of bounds'
//check curr pos, make sure desired move is valid, then update loc of trainer
//loc.translate(int, int) <- how much you need to change the position
//can use current loc and check if x pos is >= 1, if not, don't allow to move west

//! AM I USING THE RIGHT LOC.X/Y WHEN CHECKING ITS LOC !
public char goNorth() { 
    if (loc.x <= 0) {
        return 'B'; //invalid move to go east if player at right boundary
    } else {
        loc.translate(-1, 0); //update loc to move right one space
        return map.getCharAtLoc(loc); //returns char at new loc
    }
} 

public char goSouth() {
    if (loc.x >= 4) {
        return 'B'; //invalid move to go east if player at right boundary
    } else {
        loc.translate(1, 0); //update loc to move right one space
        return map.getCharAtLoc(loc); //returns char at new loc
    }
}

public char goEast() {
    if (loc.y >= 4) {
        return 'B'; //invalid move to go east if player at right boundary
    } else {
        loc.translate(0, 1); //update loc to move right one space
        return map.getCharAtLoc(loc); //returns char at new loc
    }
}

public char goWest() {
    if (loc.y <= 0) {
        return 'B'; //invalid move to go east if player at right boundary
    } else {
        loc.translate(0, -1); //update loc to move right one space
        return map.getCharAtLoc(loc); //returns char at new loc
    }
}

public int getNumPokemon() {
    return pokemon.size();
}

public void healAllPokemon() {
    for (Pokemon i: pokemon) {
        i.heal();
    }
}

public Pokemon getPokemon(int index) { 
    return pokemon.get(index);
}

public String getPokemonList() { //use in main when they come across wild pokemon, if they choose to fight, they will choose pokemon from this list
    String pokemonList = "";
    for (Pokemon i: pokemon) {
        pokemonList += (i + ". " + i.getName() + " HP: " + i.getHp() + "/" + i.getMaxHp()); //how to do newline
    }
    return pokemonList; //ask "what pokemon you want to use"
}

public String toString() {
    return getName() + " HP: " + getHp() + "/" + getMaxHp() + "\nMoney: " + money + "\nPotions: " + potions + "\nPoke Balls: " + pokeballs;
}

}