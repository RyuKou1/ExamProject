public class Goblin extends Monster {
    public Goblin(char suffix, int hp) {
        super(suffix, hp);
    }
    @Override
    public void attack(Creature target) {
        System.out.println("");
        target.setHp();
    }
}
