package level1;

import java.util.HashMap;

//완주하지 못한 선수
public class Marathon {
    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String answer = ""; //mislav

        HashMap<String, Integer> map = new HashMap<>();

        for (String part : participant) {
            map.put(part, map.getOrDefault(part, 0) + 1);
        }

        for (String comp : completion) {
            map.put(comp, map.get(comp) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
            }
        }
        System.out.println(answer);
    }
}
