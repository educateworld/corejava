package collections.list;
import java.util.*;    
class ArrayListVsVector{    
 public static void main(String args[]){    
     
  List<String> al=new ArrayList<String>();//creating arraylist    
  al.add("Ravi");//adding object in arraylist    
  al.add("Vijay");    
  al.add("Ravi");    
  al.add("Ajay");   
  Collections.sort(al);
  System.out.println(al);
  Vector<Integer> v=new Vector<Integer>();
	v.add(12);
	v.add(17);
	v.add(15);
	Collections.sort(v);
	System.out.println(v);
 }
}    