package ex05.composit;

public class BugerSet {
    private Burger burger;
    private Coke coke;
    private Potato potato;

    public BugerSet() {
        this(new Burger(), new Coke(), new Potato());
    }

    public BugerSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

}
