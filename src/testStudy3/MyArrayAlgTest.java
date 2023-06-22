package testStudy3;

class MyArrayAlg {
    static <T> T getLast(T[] a) {
        return a[a.length - 1];
    }

}

public class MyArrayAlgTest {
    public static void main(String[] args) {
        String[] language = { "c++", "c#", "JAVA" };
        String last = MyArrayAlg.getLast(language);
        System.out.println(last);
    }
}
