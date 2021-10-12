public abstract class Pokemon extends Entity{

    static final double [][] battleTable = {{1, .5, 2}, {2, 1, .5}, {.5, 2, 1}};

    public Pokemon(String n){
        super(n, 20 + (int)(Math.random() * 5));
    }

    public abstract String getSpecialMenu();

    public abstract int getNumSpecialMenuItems();

    public abstract String specialAttack(Pokemon p, int move);

    public String getBasicMenu(){
        return "What do you want to do?\n1. Fight\n2. Use Potion\n3. Throw Pokeball\n4. Run Away";
    }

    public int getNumBasicMenuItems(){
        return 4;
    }

    public String basicAttack(Pokemon p, int move){
        if (move == 1){
            return getName() + " used Slam!";
        }
        else if(move == 2){
            return getName() + " used Tackle!";
        }
        else if(move == 3){
            return getName() + " used Punch!";
        }
        return getName() + " missed!";
    }

    public String getAttackMenu(){
        return "1. Basic Attack\n2. Special Attack";
    }

    public int getNumAttackMenuItems(){
        return 3;
    }

    public String slam(Pokemon p){
        int d = (int)(Math.random() * 5);
        p.takeDamage(d);
        return p.getName() + " took " + d + "damage.";
    }

    public String tackle(Pokemon p){
        int d = (int)(Math.random() * 2) + 1;
        p.takeDamage(d);
        return p.getName() + " took " + d + "damage.";
    }

    public String punch(Pokemon p){
        int d = (int)(Math.random() * 3) + 1;
        p.takeDamage(d);
        return p.getName() + " took " + d + "damage.";
    }

    public int getType(){
        int type = 0;
        if (this instanceof Fire_Interface){
            type = 0;
        }
        else if (this instanceof Water_Interface){
            type = 1;
        }
        else if(this instanceof Grass_Interface){
            type = 2;
        }
        return type;
    }

}