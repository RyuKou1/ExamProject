public class Hero extends Character{
    private String weapon;
    public Hero(String name,int hp,String weapon) {
        super(name,hp);
        setWeapon(weapon);
    }
    public void attack(Creature target) {
        System.out.println(getName() + " attacks " + target.getName());
        target.setHp(target.getHp() - 10);
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public String getWeapon(){
        return this.weapon;
    }
}
