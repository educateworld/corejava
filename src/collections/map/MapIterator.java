package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapIterator {
	public static void main(String[] args) {
		//Map<Integer,String> map=new HashMap<>();
		Map<Integer, String> map=new LinkedHashMap<>();
		map.put(1001, "ramu");
		map.put(1002, "sai");
		map.put(1003, "mahesh");
		map.put(1003, "rajesh");
		for(Map.Entry<Integer, String>entry:map.entrySet())
{
	System.out.print(entry.getKey());
	System.out.print(entry.getValue());
	System.out.println();
}
	}

}
