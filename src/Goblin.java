public class Goblin extends Monster {
    public Goblin(String name,char suffix, int hp) {
        super(name,suffix, hp);
    }
    @Override
    public void attack(Creature target) {
        System.out.println("ゴブリン" + getName() + "はナイフで切りつけた！"+target.getName()+"に8のダメージを与えた！");
        target.setHp(target.getHp()-8);
    }
}
