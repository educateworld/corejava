package oopsconcepts.polymorphism;

public class PolymorphismDemo {
	public void showAccountNumber(int i)
	{
		System.out.println(i);
		
	}
	public void showAccountNumber(float i)
	{
		System.out.println(i);
		
	}
	String showBankName()
	{
		return "SBI";
	}
}
