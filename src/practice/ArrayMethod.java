package practice;

public class ArrayMethod {
	public static void main(String[] args)
	{
		int bucky[]={2,4,7,9};
	change(bucky);
	for(int y:bucky)
		System.out.println(y);
	}

	private static void change(int x[])
	{
	for(int counter=0;counter<x.length;counter++)
	{
		x[counter]+=5;
	}
	}

}
