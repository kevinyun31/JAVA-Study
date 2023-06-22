package testStudy3;

import java.util.HashMap;
import java.util.Collection;
import javax.swing.text.html.HTMLDocument.Iterator;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<String, Integer>();

        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));

        iteratorUsingForEach(a);
        iteratorUsingIterator(a);

    }
}
