package collections.list;
import java.util.*;    
class ArrayListVsLinkedList{    
 public static void main(String args[]){    
  List<String> al=new ArrayList<String>();//creating arraylist    
  al.add("Ravi");//adding object in arraylist    
  al.add("Vijay");    
  al.add("Ramu");    
  al.add("Ajay");    
  System.out.println("arraylist: "+al); 
  List<String> al2=new LinkedList<String>();//creating linkedlist    
  al2.add("James");//adding object in linkedlist    
  al2.add("Serena");    
  al2.add("Swati");    
  al2.add("Serena"); 
  System.out.println("linkedlist: "+al2);  
 }    
}    