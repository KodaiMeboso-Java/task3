import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ダイ");
        names.add("バーン");
        names.add("バラン");
        names.add("ハドラー");

        try {
            System.out.println(names.get(4));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("エラーです。");
        }
        /*System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));*/
    }
}
