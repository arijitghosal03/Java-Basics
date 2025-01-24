import java.util.HashMap;
import java.util.Map;
public class Maps{
    public static void main(String[] args) {
        Map<String,Integer> marks = new HashMap<>();
        marks.put("a",120);
        marks.put("b",100);
        marks.put("c",90);
        marks.put("d",20);
        for (Map.Entry<String,Integer> entry:marks.entrySet()) {
            System.out.print(entry.getKey()+" : ");
            System.out.println(entry.getValue());
            
        }
        

    }
}