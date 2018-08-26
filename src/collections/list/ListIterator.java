package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIterator {
public static void main(String[] args) {
	//List<Integer> li=new ArrayList<Integer>();
	List<Integer> li=new LinkedList<Integer>();
	li.add(22);
	li.add(43);
	li.add(59);
	li.add(56);
	Iterator<Integer> i=li.listIterator();
	while(i.hasNext())
	{
	System.out.println(i.next());
	}
	
}
}
