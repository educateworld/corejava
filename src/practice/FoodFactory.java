package practice;

public class FoodFactory {

    public Food getFood(java.lang.String string) {      // Food is the return type of this method
      Food Fastfood=new Food();
        return Fastfood;                       // Gives us the return value of this class i.e., Food
    }

    public Food serveFood() {
    	
        return new Food(); 
    }

}
