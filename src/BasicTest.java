import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BasicTest {
    public static void main(String[] args){
        // Java HashMap basics
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("three",3);
        map.put("two",2);
        map.put("zero",0);
        // Loop over the map
        for (String k : map.keySet()) {
            System.out.println("Key: " + k + " Value: " + map.get(k));
        }
        map.clear();
        System.out.println("Map Size after map.clear(): " + map.size());
        for (String k : map.keySet()) {
            System.out.println("Key: " + k + " Value: " + map.get(k));
        }
    }
}
