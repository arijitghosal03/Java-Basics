
import java.util.ArrayList;
import java.util.List;


public class Lists{
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i+=2) {
            arr.add(i);  
        }
        for (int i = 0; i < arr.size(); i++) {
            System.err.println( "Number is "+ Integer.toString(arr.get(i)));
            
        }
    }
}