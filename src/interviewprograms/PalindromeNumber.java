package interviewprograms;

public class PalindromeNumber {
 static void checkPolindrome(int num)
 {
	 int r,sum=0,temp;
	 temp=num;
	 while(num>0)
	 {
		 r=num%10;
		 sum=(sum*10)+r;
		 num=num/10;
	 }
	 if(sum==temp)
	 {
		 System.out.println(temp+" is polindrome");
	 }
	 else
	 {
		 System.out.println(temp+" is not polindrome");
	 }
 }
	
	public static void main(String[] args) {
		int num=12321;
		checkPolindrome(num);
		

	}

}
