package ex13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("kim", "1234");
        map.put("park", "pase");
        map.put("lee", "word");

        System.out.println(map.get("lee")); // 키를 가지고 값을 참조한다.

        for (String key : map.keySet()) { // 모든 항목을 반복한다.
            String value = map.get(key);
            System.out.println("key = " + key + ", value=" + value);
        }
        map.remove(3);
        map.put("choi", "password");
        System.out.println(map);

    }
}
