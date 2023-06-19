package testStudy3;

import java.io.IOException; //exception=예외
import java.io.InputStreamReader;
import java.io.InputStream;

public class Sample {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);

        char[] a = new char[3];
        reader.read(a);

        System.out.println(a);
    }
}
