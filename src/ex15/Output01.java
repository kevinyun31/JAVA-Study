package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Output01 {
    public static void main(String[] args) {

        OutputStream os = System.out;
        OutputStreamWriter ow = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ow);

        try {
            bw.write("안녕"); // /n 을 붙여서 전할 통신이 끝났음을 알려준다.
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
