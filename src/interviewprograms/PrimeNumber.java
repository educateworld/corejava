package interviewprograms;

public class PrimeNumber {
	static void checkPrimeNumber(int num)
	{ 
	 int count=0;
		for(int i=1;i<=num/2;i++)
		{
	if((num%i)==0)	
	{
	count++	;
	}
		}
	if(count==1)
	{
		System.out.println(num+" is Prime Number ");
	}
	else {
		System.out.println(num+" is not Prime Number");
	}
	}
	public static void main(String[] args) {
		int num=777;
		checkPrimeNumber(num);
	}

}
