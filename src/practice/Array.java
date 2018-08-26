package practice;

public class Array {
	public static void main(String[] args)
	{
		int bucky[]={20,23,34,45};
		int sum=0;
//System.out.println("index\tvalue");
		for(int x:bucky)
		{
			sum=sum+x;
			//System.out.println(bucky[x]+"\t"+x);
		}
		System.out.println("sum:"+sum);
	}
}
