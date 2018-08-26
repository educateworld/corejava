package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


public class IteratorVsListIterator {
	public static void main(String[] args) {
		
	
	ArrayList<String> al=new ArrayList<String>();
	al.add("ram");
	al.add("uma");
	al.add("umaram");
	al.add("122.22f");
	al.remove(1);
	System.out.println("Arralist size:"+al.size());
	Iterator<String> i=al.iterator();
	while(i.hasNext())
	{
		System.out.println( i.next());
	}
	ArrayList<Integer> ali=new ArrayList<Integer>();
	ali.add(12);
	ali.add(17);
	ali.add(15);
	Collections.sort(ali);
	//Arrays.sort(ali);
	
	ListIterator<Integer> li= ali.listIterator();
	while(li.hasNext())
	{
		Integer val=(Integer) li.next()*2;
		li.set(val);
		}
		System.out.println( ali);
	
		
		
		//}
	
	
	}	

}
