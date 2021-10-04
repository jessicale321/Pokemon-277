public class Entity {
    
    private String name;
    private int hp;
    private int maxHp;
    
    public Entity(String n, int mHp){}
    
    public int getHp(){return hp;}
    
    public int getMaxHp(){return maxHp;}
    
    public void takeDamage(int d){}
    
    public void heal(){}
    
    public String getName(){return name;}
    


    @Override
    public String toString(){return (name + "HP: " + hp + "/" + maxHp);} 

}

