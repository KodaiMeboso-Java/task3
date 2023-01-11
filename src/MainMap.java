import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<Integer, String> heroMap = new HashMap<>();
        heroMap.put(1,"ダイ");
        heroMap.put(2,"バーン");
        heroMap.put(3,"アバン");
        heroMap.put(4,"バラン");

        for (String val : heroMap.values()){
            System.out.println(val);
        }
    }
}
