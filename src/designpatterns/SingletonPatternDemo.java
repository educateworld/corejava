package designpatterns;
public class SingletonPatternDemo {
   public static void main(String[] args) {

      SingleObject object = SingleObject.getInstance();
      
      SingleObject object2 = SingleObject.getInstance();

   }
}