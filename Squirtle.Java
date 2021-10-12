abstract class Squirtle extends Pokemon{

    public Squirtle(){
        super("Squirtle");
       // type = 1;
    }
     public String getSpecialMenu() {
        return "1. Water Gun\n2. Bubble Beam\n3. Waterfall";
    }

    public int getNumSpecialMenuItems() {
        return 3;
    }
    public String specialAttack(Pokemon p, int move) {
        String saying = "";
        switch (move) {
            case 1:
                saying = p.getName() + " used Water Gun!";
                break;
            case 2:
                saying = p.getName() + " used Bubble Beam!";
                break;
            case 3:
                saying = p.getName() + " used water fall!";
                break;
            default:
                break;
        }
        return saying;
    }

    public String waterGun(Pokemon p) {
        String atk = "";
        switch (p.getType()) {
            case 0: {
                int d = (int) (((int) (Math.random() * 4) + 2) * battleTable[getType()][0]);
                p.takeDamage(d);
                atk = p.getName() + " took " + d + "damage.";
                break;
            }
            case 1: {
                int d = (int) (((int) (Math.random() * 4) + 2) * battleTable[getType()][1]);
                p.takeDamage(d);
                atk = p.getName() + " took " + d + "damage.";
                break;
            }
            case 2: {
                int d = (int) (((int) (Math.random() * 4) + 2) * battleTable[getType()][2]);
                p.takeDamage(d);
                atk = p.getName() + " took " + d + "damage.";
                break;
            }
            default:
                break;
        }
        return atk;
    }

    public String bubbleBeam(Pokemon p) {
        String atk = "";
        switch (p.getType()) {
            case 0: {
                int d = (int) ((int) (Math.random() * 3) + 1 * battleTable[getType()][0]);
                p.takeDamage(d);
                atk = p.getName() + " took " + d + "damage.";
                break;
            }
            case 1: {
                int d = (int) ((int) (Math.random() * 3) + 1 * battleTable[getType()][1]);
                p.takeDamage(d);
                atk = p.getName() + " took " + d + "damage.";
                break;
            }
            case 2: {
                int d = (int) ((int) (Math.random() * 3) + 1 * battleTable[getType()][2]);
                p.takeDamage(d);
                atk = p.getName() + " took " + d + "damage.";
                break;
            }
            default:
                break;
        }
        return atk;
    }

    public String waterFall(Pokemon p) {
        String atk = "";
        switch (p.getType()) {
            case 0: {
                int d = (int) ((int) (Math.random() * 4) + 1 * battleTable[getType()][0]);
                p.takeDamage(d);
                atk = p.getName() + " took " + d + "damage.";
                break;
            }
            case 1: {
                int d = (int) ((int) (Math.random() * 4) + 1 * battleTable[getType()][1]);
                p.takeDamage(d);
                atk = p.getName() + " took " + d + "damage.";
                break;
            }
            case 2: {
                int d = (int) ((int) (Math.random() * 4) + 1 * battleTable[getType()][2]);
                p.takeDamage(d);
                atk = p.getName() + " took " + d + "damage.";
                break;
            }
            default:
                break;
        }
        return atk;
    }
}
