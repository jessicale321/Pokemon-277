class Oddish extends Pokemon implements Grass_Interface{

    public Oddish(){
        super("Oddish");

    }

    public String getSpecialMenu() {
        return specialMenu;
    }


    public int getNumSpecialMenuItems() {
        return 0;
    }

    public String specialAttack(Pokemon p, int move) {
        if (move == 1){
            return p.getName() + " used Vine Whip!";
        }
        else if(move == 2){
            return p.getName() + " used Razor Leaf!";
        }
        else if(move == 3){
            return p.getName() + " used Solar Beam!";
        }
        return p.getName() + " missed!";
    }


    public String vineWhip(Pokemon p) {
        String atk = "";
        if (p.getType() == 0)
        {
            int d = (int) (((int) (Math.random() * 2) + 1) * battleTable[getType()][0]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        else if (p.getType() == 1)
        {
            int d = (int)(((int)(Math.random() * 2) + 1) * battleTable[getType()][1]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        else if (p.getType() == 2)
        {
            int d = (int)(((int)(Math.random() * 2) + 1) * battleTable[getType()][2]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        return atk;
    }


    public String razorLeaf(Pokemon p) {
        String atk = "";
        if (p.getType() == 0)
        {
            int d = (int)((int)(Math.random() * 2) + 2 * battleTable[getType()][0]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        else if (p.getType() == 1)
        {
            int d = (int)((int)(Math.random() * 2) + 2 * battleTable[getType()][1]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        else if (p.getType() == 2)
        {
            int d = (int)((int)(Math.random() * 2) + 2 * battleTable[getType()][2]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        return atk;
    }


    public String solarBeam(Pokemon p) {
        String atk = "";
        if (p.getType() == 0)
        {
            int d = (int)((int)(Math.random() * 3) * battleTable[getType()][0]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        else if (p.getType() == 1)
        {
            int d = (int)((int)(Math.random() * 3) * battleTable[getType()][1]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        else if (p.getType() == 2)
        {
            int d = (int)((int)(Math.random() * 3) * battleTable[getType()][2]);
            p.takeDamage(d);
            atk = p.getName() + " took " + d + "damage.";
        }
        return atk;
    }
}
