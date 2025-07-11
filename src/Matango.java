public class Matango extends Monster{
    public Matango(char suffix,int hp) {
        super(suffix,hp);
    }
    @Override
    public void attack(Creature target) {
        System.out.println("<UNK>");
        target.setHp();
    }
}
