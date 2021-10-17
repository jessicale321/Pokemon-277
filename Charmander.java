public class Charmander extends Pokemon implements Fire_Interface {
    
    public Charmander() {
        super("Charmander");
    }

    public String getSpecialMenu() {
        return specialMenu;
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
        return p.getName() + " missed!";
    }

    @Override
    public String ember(Pokemon p) {
        String atk = "";
        if (p.getType() == 0) {
            int d = (int)((int)(Math.random() * 3) * battleTable[getType()][0]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        else if (p.getType() == 1) {
            int d = (int)((int)(Math.random() * 3) * battleTable[getType()][1]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        else if (p.getType() == 2) {
            int d = (int)((int)(Math.random() * 3) * battleTable[getType()][1]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        return atk;
    }

    @Override
    public String fireBlast(Pokemon p) {
        String atk = "";
        if (p.getType() == 0) {
            int d = (int)((int)((Math.random() * 4) + 1) * battleTable[getType()][0]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        else if (p.getType() == 1) {
            int d = (int)((int)((Math.random() * 4) + 1) * battleTable[getType()][1]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        else if (p.getType() == 2) {
            int d = (int)((int)((Math.random() * 4) + 1) * battleTable[getType()][2]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        return atk;
    }

    @Override
    public String firePunch(Pokemon p) {
        String atk = "";
        if (p.getType() == 0) {
            int d = (int)((int)((Math.random() * 3) + 1) * battleTable[getType()][0]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        else if (p.getType() == 1) {
            int d = (int)((int)((Math.random() * 3) + 1) * battleTable[getType()][1]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        else if (p.getType() == 2) {
            int d = (int)((int)((Math.random() * 3) + 1) * battleTable[getType()][2]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        return atk;
    }
}
