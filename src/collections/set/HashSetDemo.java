package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> al=new HashSet<String>();
		al.add("ram");
		al.add("uma");
		al.add("umaram");
		al.add("122.22f");
		al.remove(1);
		System.out.println("Hash set size:"+al.size());
		Iterator<String> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println( i.next());
		}
	}

}
