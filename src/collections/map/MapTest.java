package collections.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map=createMap();
		map.put("umaram", 1+map.getOrDefault("umaram", 3));
		map.forEach((k,v)->System.out.printf("%s%s%n",k,v));
		
		List<Integer> list = Arrays.asList(5,4,3,7,2,1);
        // sort it
        Collections.sort(list);
        // print each element to the console
        list.forEach(System.out::println);
	}
	
	public static Map<String, Integer> createMap()
	{
		Map<String, Integer> map=new HashMap<String,Integer>();
		map.put("ramu", 1);
		map.put("uma",2);
		
		return map;
	}

}
