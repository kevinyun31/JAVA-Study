package ex05.ch02;

public class Dragoon extends ProtossUnit {
    String name;
    int hp;
    int attack;

    public Dragoon(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }
}
