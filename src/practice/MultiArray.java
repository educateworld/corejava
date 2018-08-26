package practice;

public class MultiArray {
	public static void main(String[] args)
	{
		int firstarray[][]={{1,2,3,4},{5,6,7,8}};
		int secondarray[][]={{1,2,4,5},{5,6,8,9}};
		System.out.println("this is first Array::");
		display(firstarray);
		System.out.println("this is second Array::");
		display(secondarray);
		
	}

	private static void display(int[][] firstarray) {
for(int row=0;row<firstarray.length;row++)
{
for(int col=0;col<firstarray[row].length;col++)
{
	System.out.print(firstarray[row][col]+"\t");
}
System.out.println();
}
	}
}
