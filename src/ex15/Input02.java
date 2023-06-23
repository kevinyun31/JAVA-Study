package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.stream.ImageInputStream;

public class Input02 {
    public static void main(String[] args) {
        // 연결 (키보드)

        InputStreamReader ir = new InputStreamReader(System.in);

        // 읽기
        try {
            char[] ch = new char[5];
            ir.read(ch);

            for (char c : ch) {
                System.out.print(c);

            }
            System.out.println(ch);
        } catch (IOException e) {
            e.printStackTrace(); // 오류 내용을 트래스로 다 보여준다는 말
        }

    }

}
