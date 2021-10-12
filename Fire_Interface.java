public interface Fire_Interface {

    public String specialMenu = "1. Ember\n2. Fire Blast\n3. Fire Punch";
    public int numSpecialMenuItems = 3;

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