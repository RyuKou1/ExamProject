public class Matango extends Monster{
    public Matango(String name,char suffix,int hp) {
        super(name,suffix,hp);
    }
    @Override
    public void attack(Creature target) {
        System.out.println("お化けキノコ"+getSuffix()+"は体当たりの攻撃！"+target.getName()+"に6のダメージを与えた！");
        target.setHp(target.getHp()-6);
    }
}
