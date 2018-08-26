package exceptionhandling;
public class MultipleCatchWithORoperator{  
  public static void main(String args[]){  
   try{  
      int data=50/0;  
   }
   catch(ArithmeticException|ArrayIndexOutOfBoundsException|NullPointerException e)
   {System.out.println(e);}  
   System.out.println("rest of the code...");  
}  
  
}  