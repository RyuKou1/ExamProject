public class Thief extends Character{
    public Thief(String name,int hp){
        super(name,hp);
    }
    public void attack(Creature target){
        System.out.println("Thief attacked!");
        target.setHp();
    }
}
