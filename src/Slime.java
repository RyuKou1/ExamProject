final public class Slime extends Monster{
    public Slime(char suffix , int hp){
        super(suffix, hp);
    }
    public void attack(Creature target){
        System.out.println("");
        target.setHp();
    }
}
