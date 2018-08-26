package collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("umaram");
	ll.add("dad");
	ll.add("mom");
	Iterator i=ll.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
