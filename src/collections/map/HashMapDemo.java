package collections.map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"ram");
		hm.put(2,"uma");
		hm.put(3,"umaram");
		hm.put(4,"122.22f");
		hm.remove(1);
		System.out.println("Hash set size:"+hm.size());
		hm.forEach((k,v) -> { System.out.println(k + " ( hash code:"+k.hashCode()+") value:" + v + ", "); });

       // System.out.println("\nHashMap (2): ");*/

        hm.entrySet().forEach((e) -> { 
            System.out.println(e.getKey() + " : " + e.getValue() + ", ");
        });     
		
	}

}
