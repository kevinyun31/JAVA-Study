package testStudy2;

import javax.swing.UIDefaults.ProxyLazyValue;

interface Predator {
    String getFood();
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
    public String getFood() {
        return "apple";
    }

    class Lion extends Animal implements Predator {
        public String getFood() {
            return "banana";
        }

        class ZooKeper {
            void feed(Predator predator) {
                System.out.println("feed " + predator.getFood());
            }
        }

public class Sample {
    public static void main(String[] args) {
        ZooKeper zooKeper = new ZooKeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeper.feed(tiger);
        zooKeper.feed(lion);
    }
}
