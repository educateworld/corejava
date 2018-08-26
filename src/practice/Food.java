package practice;
class Food extends FoodFactory
{
    public static void main(String args[]) {
        // This object creation would call the default constructor
        FoodFactory myFoods = new FoodFactory();
      // System.out.println(myFoods.getFood("Fastfood"));
        Food food1 = myFoods.getFood("Fastfood");
        Food food2 = myFoods.getFood("Fruits");
        System.out.println("My name is: " + food1.getClass().getName());                                    // Prints "My name is Food" since getFood in the foodFactory class returns the value "Food"
        System.out.println("My name is: " + food2.getClass().getName());
        System.out.println("Our superclass is: " + food1.getClass().getSuperclass().getName());   // You can obtain it's class object by calling getClass() on the object. 
        // could not able to access another class methods
         //food1.serveFood();
        // food2.serveFood();
        myFoods.serveFood();
        myFoods.serveFood();

    }

}