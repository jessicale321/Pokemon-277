public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Change in testing?");

        System.out.println("Prof. Oak: Hello there new trainer, what is your name? ");
        //name input and store as trainer name
        //trainer user = new trainer("testName", Pokemon, Map);
        System.out.println("Great to meet you, " + trainer.getName());
        System.out.println("Choose your first pokemon:\n1. Charmander\n2. Bulbasaur\n3. Squirtle");
        //take int input to choose pokemon
    }

    public void mainMenu() {
        System.out.println("Main Menu");
        System.out.println("1. Go North\n2. Go South");
    }

    public int chooseRandPokemon() {
        int random = (int)(Math.random() * 6 + 1);
        //construct pokemon based on random
        //return pokemon?? or random?
        return random;
    }

    public static void trainerAttack(trainer t, Pokemon wild) {
    }

    public static void store(trainer t) {

    }
}