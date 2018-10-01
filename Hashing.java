import java.util.HashMap;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("A", "Nancy Ninja");
        userMap.put("B", "Sam Samurai");
        userMap.put("C", "Walter Wizard");
        userMap.put("D", "Walter Wizard");
        userMap.put("E", "Walter Wizard");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        // for(String key : keys) {
        //     System.out.println(key);
        //     System.out.println(userMap.get(key));    
        // }
        System.out.println(userMap.get("A"));
    }
}