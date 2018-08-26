package collections.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapVsHashTable {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"ramu");
		hm.put(2, "uma");
		hm.put(3, null);
		hm.put(null,null);
		System.out.println(hm);
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1,"ramu");
		ht.put(2, "uma");
		ht.put(3, "umaram");
		//ht.put(null,null);
		System.out.println(ht);
	}

}
