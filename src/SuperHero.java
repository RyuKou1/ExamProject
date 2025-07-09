public class SuperHero {
    public SuperHero() {
        super();
    }
    public void attack(Creature target) {
        System.out.println();
        target.hp -= 25;
    }
}
