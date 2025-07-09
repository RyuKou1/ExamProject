public class Wizard extends Character{
    private int mp;
    public Wizard() {
        super();
    }
    public void attack(Creature target){
        System.out.println();
        target.setHp();
        this.mp -= 1;
    }
}
