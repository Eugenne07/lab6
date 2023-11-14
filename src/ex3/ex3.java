package ex3;
import java.util.HashMap;
import java.util.Map;
public class ex3 {
    public static void main(String[] args) {
        HashMap<String,String> note = new HashMap<>();
        note.put("10", "8");
        note.put("8", "9");
        System.out.println(note.get("10"));
        for (Map.Entry<String, String> e: note.entrySet()) {
            System.out.println("Key:" + e.getKey() + " value:" + e.getValue());
        }
    }

}
