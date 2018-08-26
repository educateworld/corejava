package ooppractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringConcept {
	
	public static void main(String[] args) {
		List <String> li=new ArrayList();
		li.add("ramu");
		li.add("raju");
		li.add("soumya");
		
		/*List <StringBuffer> li=new ArrayList<StringBuffer>();
		li.add(new StringBuffer("ramu"));
		li.add(new StringBuffer("raju"));
		li.add(new StringBuffer("soumya"));*/
		
		Iterator i=li.iterator(); 
		while(i.hasNext()){
		System.out.println(i.next());
		System.out.println(i.hashCode());
	}
		 String s="ramu";
		 String s1=new String("ramu");
		 String s2=new String("ramu");
		  StringBuffer sb=new StringBuffer("ramu");
		  s="Sachin"; 
		 s="ram sachin";
		 System.out.println(s1.hashCode()+","+s2.hashCode());
		 System.out.println(s==s1);
		 System.out.println(s1==s2);
		 System.out.println(s.equals(s1));
		 System.out.println(s1.equals(s2));
		 System.out.println(s1.equals(sb));
		   s1.concat(" Tendulkar"); //concat() method appends the string at the end 
		   sb.append(" Tendulkar");
		  // System.out.println(ss);
		   //System.out.println(s);
			System.out.println(s1);
			System.out.println(sb);
			
	}
}
