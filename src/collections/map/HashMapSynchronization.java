package collections.map;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSynchronization {
    public static void main(String[] args) {
        // create map
        Map<String,String> map = new ConcurrentHashMap<String,String>();
        
        // populate the map
        map.put("1","ALIVE ");
        map.put("2","IS");
        map.put("3","AWESOME");
        
        // create a synchronized map
      //  Map<String,String> syncMap = Collections.synchronizedMap(map);
        
        System.out.println("Synchronized map :"+map);
    }
}