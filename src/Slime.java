final public class Slime extends Monster{
    public Slime(String name, char suffix , int hp){
        super(name,suffix, hp);
    }
    @Override
    public void attack(Creature target){
        System.out.println("スライム"+getName()+"は体当たり攻撃！"+ target.getName()+"に5のダメージを与えた！");
        target.setHp(Math.max(target.getHp() - 5, 0));
    }
}
