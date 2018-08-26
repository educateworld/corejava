package designpatterns;
public class SingleObject {

   //Initialize an object of SingleObject
   private static SingleObject instance;

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){}

   //Get the only object available
   public static SingleObject getInstance(){
	   if(instance==null) {
		    instance=new SingleObject();
		   System.out.println("Object created");
	   }
      return instance;
   }
   /*public static void main(String[] args) {

	      SingleObject object = SingleObject.getInstance();
	      
	      SingleObject object2 = SingleObject.getInstance();

	   }*/
  
}