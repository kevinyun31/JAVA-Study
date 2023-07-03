package testStudy5;

import java.awt.Dimension;
import javax.swing.JFrame; //import가 자동불러오기 안되면 ctrl+shift+o 단축키로 불러오자.
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FramPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();  // 라이브러리에서 불러오기 import
        JPanel panel = new JPanel();  // 불러오기

        panel.add(new JLabel("hello world!!"));  //화면에 출력될 내용을 넣는다.
        frame.add(panel);  //panel을 frame안에 넣어 줌으로써 화면에 출력이 된다. 셋트다 셋트.

        frame.setResizable(false); // 창크기 변경불가, true하면 변경가능.
        frame.setVisible(true); // 화면에 frame을 나오게한다 true,기본값은 false로 안나오게 한다
        frame.setPreferredSize(new Dimension(840, 840 / 12 * 9)); // frame 크기조정
        frame.setSize(840, 840 / 12 * 9); // frame 사이즈 세팅
        frame.setLocationRelativeTo(null); // frame 생성위치 null은 중앙이다
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // fram은 기본적으로 demon형식이라서 EXIT_ON_CLOSE 명령어를 넣어서 종료시 꺼지도록 해야한다.
    }

}
