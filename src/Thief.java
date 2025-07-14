public class Thief extends Character{
    public Thief(String name,int hp){
        super(name,hp);
    }
    @Override
    public void attack(Creature target){
        System.out.println(getName() + "は素早く攻撃した！"+target.getName()+"に5のダメージを与えた！");
        target.setHp(Math.max(target.getHp() - 5, 0));
    }
}
