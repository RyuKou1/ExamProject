public class Wizard extends Character{
    private int mp;
    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }
    public void attack(Creature target){
        System.out.println();
        target.setHp();
        this.mp -= 1;
    }
}
