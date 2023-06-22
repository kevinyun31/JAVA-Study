package ex13;

import java.sql.Array;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);

        if (set.contains("Ham")) {
            System.out.println("Ham도 포함되어 있음");
        }
        // Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
        // Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));

        // s1.retainAll(s2);
        // System.out.println(s1);
    }
}
