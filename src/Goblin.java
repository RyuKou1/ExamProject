public class Goblin extends Monster {
    public Goblin() {

    }
    @Override
    public void attack(Creature target) {
        System.out.println("");
        target.setHp();
    }
}
