public class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;
    public Monster(int hp, char suffix) {
        setSuffix(suffix);
        setHp(hp);
    }
    final public boolean isAlive(){
        return this.hp > 0;
    }
    public void showStats() {
        System.out.println(this.name + this.suffix +":HP" + this.hp);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setHp(int hp){
        if(hp < 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        } else {
            this.hp = hp;
        }
    }
    public int getHp(){
        return this.hp;
    }
    public void setSuffix(char suffix){
        this.suffix = suffix;
    }
    public char getSuffix(){
        return this.suffix;
    }
}
