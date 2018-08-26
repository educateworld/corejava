package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIterator {

	public static void main(String[] args)
	{
//Set <Integer> set=new LinkedHashSet<Integer>(); 
Set <Integer> set=new TreeSet<Integer>(); 
set.add(23);
set.add(34);
set.add(67);
set.add(45);
set.add(23);
Iterator<Integer> i=set.iterator(); 
while(i.hasNext())
{
	System.out.println(i.next());
	}

	
	}

}
