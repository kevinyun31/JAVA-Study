package ex05.ch01;

public class App {
    // 질럿 공격
    static void attack(Zealot u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.print(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(Zealot u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.print(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(Zealot u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.print(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }
    // 드라군 공격

    static void attack(Dragoon u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.print(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(Dragoon u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.print(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(Dragoon u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.print(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    // 다템 공격
    static void attack(DarkTempler u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.print(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(DarkTempler u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.print(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(DarkTempler u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.print(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("질럿1", 100, 10);
        Zealot z2 = new Zealot("질럿2", 100, 10);
        Dragoon d1 = new Dragoon("드라군1", 100, 5);
        Dragoon d2 = new Dragoon("드라군2", 100, 5);
        DarkTempler dt1 = new DarkTempler("다크1", 100, 50);
        DarkTempler dt2 = new DarkTempler("다크1", 100, 50);

        // 질럿 공격
        attack(z1, z1);
        attack(z1, d1);
        attack(z1, dt1);
        System.out.println();
        // 드라군 공격
        attack(d1, z1);
        attack(d1, d1);
        attack(dt1, dt1);
        System.out.println();
        // 다템 공격
        attack(dt2, z1);
        attack(dt1, d1);
        attack(dt1, dt1);

        // 오버로딩 체험하기
        System.out.println();
        System.out.println(1);
        System.out.println(1.1);
        System.out.println("가");
        System.out.println("문자열");
        System.out.println(true);

    }

}
