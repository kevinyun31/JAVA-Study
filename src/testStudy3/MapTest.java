package testStudy3;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("kim", "1234");
        map.put("park", "pass");
        map.put("lee", "word");

        System.out.println(map.get("lee")); // 키를 가지고 값을 참조한다.

        for (String key : map.keySet()) { // 모든 항목을 방문한다.
            String value = map.get(key);
            System.out.println("key= " + key + ", value = " + value);

        }

        map.remove(3); // 하나의 항목을 삭제
        map.put("choi", "password"); // 하나의 항목을 대치
        System.out.println(map);
    }
}
