package collections.set;
import java.util.*;  
class LinkedHashSetDemo{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
 // HashSet<String> set=new HashSet<String>();  
  LinkedHashSet<String> set=new LinkedHashSet<String>(); 
  set.add("Ravi");  
  set.add("Vijay");  
  set.add("Ravi");  
  set.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  