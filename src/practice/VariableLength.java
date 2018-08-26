package practice;

public class VariableLength {
	public static void main(String[]args)
	{
		System.out.println(average(20,30,40,50,60));
	}

	private static int average(int ...num) {
int total=0;
for(int x:num)
	total+=x;
		return total/num.length;
	}

}
