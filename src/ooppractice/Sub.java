package ooppractice;

public class Sub extends Super
{
	static void setTax()
	{
		System.out.println("in sub 6%");
	}
	public static void main(String[] args) {
		Super s=new Super();
		s.display();
	}
	
}

