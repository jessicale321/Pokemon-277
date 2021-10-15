import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Change in testing?");
        Scanner in = new Scanner(System.in);
        Scanner poke = new Scanner(System.in);
        System.out.println("Prof. Oak: Hello there new trainer, what is your name? ");
        String input = in.nextLine();
        System.out.println("Great to meet you, " + input + "!");
        System.out.println("Choose your first pokemon:\n1. Charmander\n2. Bulbasaur\n3. Squirtle");
        int first = poke.nextInt();
        Pokemon n = null;
        if (first == 2){
            n = new Bulbasaur();
        }
        trainer user = new trainer(input, n, Map);//take int input to choose pokemon
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
        System.out.println("A wild " + wild.getName() + " appeared!");
        Scanner in = new Scanner(System.in);
        while (wild.getHp() > 0){
            System.out.println(wild.getBasicMenu());
            int start = in.nextInt();
            if (start == 1){
                System.out.println(wild.);
            }
        }

    }

    public static void store(Trainer t) {
       boolean quit = false;       
       int money =  t.getMoney();
        
        do {
            System.out.println("Hello! What can I help you with?");
            System.out.println("1. Buy Potions - $5 ");
            System.out.println("2. Buy Poke Balls - $3");
            System.out.println("3. Exit");
            int choice = CheckInput.getIntRange(1, 3);
            switch (choice) {
                   case 1:
                       System.out.println("Here's your potion.");
                       money-=5;
                       break;
                   case 2:
                       System.out.println("Here's your Poke Balls");
                       money-=3;
                       break;
                   case 3:
                       System.out.println("Thank you, come again soon!");
                       quit = true;
                       break;
                   default:
                       break;
               }
           } while (!false);              
    }
}
