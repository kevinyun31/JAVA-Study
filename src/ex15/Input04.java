package ex15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

import javax.imageio.stream.ImageInputStream;

public class Input04 {
    public static void main(String[] args) {
        // 연결 (키보드)

        try {

            InputStream in = new FileInputStream("input.txt");
            InputStreamReader ir = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ir);

            String allData = "";

            while (true) { // while문은 끝을 알수없는 값 일때 사용. 그래서 끝에 break; 를 넣어준다
                String data = br.readLine(); // readLine 내 버퍼를 비우며 읽어 들인다.

                if (data == null)
                    break;

                allData = allData + data;
            }
            System.out.println(allData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
