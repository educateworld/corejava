package string;

public class StringReverseTest {
	
	public static void stringReverseWithOutRevFunction(String name)
	{
		char c[]=name.toCharArray();
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
	}
	public static void main(String[] args) {
		String name="ramu";
		stringReverseWithOutRevFunction(name);
		
	}

}
