package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

import javax.imageio.stream.ImageInputStream;

public class Input03 {
    public static void main(String[] args) {
        // 연결 (키보드)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 읽기
        try {
            String data = br.readLine();
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace(); // 오류 내용을 트래스로 다 보여준다는 말
        }

    }

}
