package interviewprograms;

public class ExceptionFirst {
public static void main(String[] args) {
	
	int a=10,b=10,c;
	try{
c=a/b;
System.out.println(c);
	}
	catch(ArithmeticException ae)
	{
		ae.printStackTrace();
	}
finally
{
	System.out.println("chance of arthmetic exception");
}
}

}
