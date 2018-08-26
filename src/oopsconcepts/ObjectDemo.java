package oopsconcepts;

public class ObjectDemo {
	public String showObject()
	{
		return "First Object is Created";
	}
	public static void main(String[] args) {
		ObjectDemo obj=new ObjectDemo();
		System.out.println(obj.showObject());
	}

}
