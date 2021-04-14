import java.util.Map;
import java.util.TreeMap;

public class TreeMapCheckString {
    public static void main(String[] args) {
        String word = "Welcome to CodeGym";
        System.out.println(word);
        word = word.toUpperCase();
        String[] parts = word.split(" ");
        Map<Integer, String> map = new java.util.TreeMap<>();
            for (int j=0; j<parts.length; j++){
                map.put(j+1, parts[j]);
        }
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(value +": " +key);
        }
    }
}
