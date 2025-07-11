import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<>();
        ArrayList<Monster> monsters = new ArrayList<>();
        Hero h = new Hero("勇者",100,"剣");
        SuperHero superHero = new SuperHero(h);
        party.add(h);
        Wizard w = new Wizard("魔法使い",60,50);
        party.add(w);
        Thief t = new Thief("盗賊",70);
        party.add(t);
        Matango m = new Matango("お化けキノコ",'A',45);
        monsters.add(m);
        Goblin g = new Goblin("ゴブリン",'A',50);
        monsters.add(g);
        Slime s = new Slime("スライム",'A',40);
        monsters.add(s);

        System.out.println("---味方パーティ---");
        h.showStatus();
        w.showStatus();
        t.showStatus();
        System.out.println("---敵グループ---");
        m.showStatus();
        g.showStatus();
        s.showStatus();
    }
}
