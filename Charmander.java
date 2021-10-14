class Charmander extends Pokemon implements Fire_Interface {
    
    public Charmander() {
        super("Charmander");
    }

    public String getSpecialMenu() {
        return "hello";
    }

    public int getNumSpecialMenuItems() {
        return 3;
    }

    public String specialAttack(Pokemon p, int move) {
        if (move == 1) {
            return p.getName() + " used Ember!";
        }

        else if (move == 2) {
            return p.getName() + " used Fire Blast!";
        }

        else if (move == 3) {
            return p.getName() + " used Fire Punch!";
        }
    }

    public String ember(Pokemon p) {
        return "ember";
    }

    public String fireBlast(Pokemon p) {
        return "fireBlast";
    }

    public String firePunch(Pokemon p) {
        return "firePunch";
    }
}
