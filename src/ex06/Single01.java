package ex06;

import javax.crypto.SealedObject;
import javax.sound.sampled.SourceDataLine;
import javax.swing.UIDefaults.ProxyLazyValue;

class 미니언 {
    public 미니언() {
        System.out.println("미니언이 생성되었습니다");
    }

}

class 바론 {
    private static 바론 instance = new 바론();

    public static 바론 getInstance() {
        return instance;
    }

    private 바론() {
    }
}

public class Single01 extends Object {
    미니언 m1 = new 미니언();
    미니언 m3 = new 미니언();
    미니언 m2 = new 미니언();

    바론 b1 = 바론.getInstance();
    바론 b2= 바론.getInstance();

    if(b1 instanceof 바론)
    {
        System.out.println("같은 타입 입니다.");
    }if(b1 instanceof Object)
    {
        System.out.println("바론과 오브젝트는 같은 타입입니다.");
    }
    String str = "안녕";
    Object obj = str;
}}