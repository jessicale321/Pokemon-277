public abstract class Entity {
    
    private String name;
    private int hp;
    private int maxHp;
    
    public Entity(String n, int mHp){
        name = n;
        maxHp = mHp;
        hp = maxHp;
    }
    
    public int getHp(){
        return hp;
    }
    
    public int getMaxHp(){
        return maxHp;
    }
    
    public void takeDamage(int d){
        
        if (hp>0){
            if (hp>d) {    
                hp-=d;
            }
        }
        if(hp<d){
            hp =0;
        }  
    }
    
    public void heal(){ 
        hp = maxHp;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){return (name + " HP: " + hp + "/" + maxHp);} 

}
