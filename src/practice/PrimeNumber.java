package practice;

import java.util.Scanner;

class PrimeNumber {
	public static void main(String[] args) {
		int a,temp=0;
		System.out.println("Enter Number to Check prime or Not:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<a/2;i++)
		{
			if(a%i==0)
			{
				temp++;
			}
		}
		if(temp<=2)
		{
			System.out.println("Given number is prime");
		}
	}

}
