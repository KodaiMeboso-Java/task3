import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<Integer, String> hereMap = new HashMap<>();
        hereMap.put(1,"ダイ");
        hereMap.put(2,"バーン");
        hereMap.put(3,"アバン");
        hereMap.put(4,"バラン");

        for (String val : hereMap.values()){
            System.out.println(val);
        }
    }
}
