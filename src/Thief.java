public class Thief extends Character{
    public Thief(){
        super();
    }
    public void attack(Creature target){
        System.out.println("Thief attacked!");
        target.setHp();
    }
}
