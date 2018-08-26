package collections.list;

import java.util.Collections;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(12);
		v.add(17);
		v.add(15);
		Collections.sort(v);
		//Arrays.sort(ali);
		
		ListIterator liv= v.listIterator();
		while(liv.hasNext())
		{
			Integer val2=(Integer) liv.next()*2;
			liv.set(val2);
			}
			System.out.println( v);
	}

}
