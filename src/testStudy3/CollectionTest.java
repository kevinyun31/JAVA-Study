package testStudy3;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionTest {

    public static void main(String[] args) {
        Collection<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);

        // HashSet<Integer> B = new HashSet<Integer>();
        // B.add(1);
        // B.add(2);
        // B.add(3);

        // HashSet<Integer> C = new HashSet<Integer>();
        // C.add(1);
        // C.add(2);
        // C.add(3);

        // System.out.println(A.containsAll(B));
        // System.out.println(A.containsAll(C));

        // A.addAll(B); // A와B의 합집합
        // A.retainAll(B); // A와B의 교집합
        // A.removeAll(B); // A와B의 차집합 - 빼고 남은 값

        // Iterator hi = A.iterator();
        // while (hi.hasNext()) {
        //     System.out.println(hi.next());
        } 
    }
}