package ooppractice;

import java.util.Scanner;

public class BankAccount
{
String accountno,name,address,bankbranch;
double balance;
BankAccount()
{
bankbranch="SBI";
balance=10000.0;
}
BankAccount(double bal)
{
bankbranch="SBI";
balance=bal;
}
void createAccount(String actno,String nm,String addr) 
{
	accountno=actno;
	name=nm;
	address=addr;	
}
void deposit(double amt)
{
	balance=balance+amt;
}
void showAccount()
{
	System.out.println("your account details are:\naccountno:"+accountno+",name:"+name+",bal:"+balance+",branch:"+bankbranch);
}
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String accountno,name,address;
	System.out.println("Enter your name:");
	name=sc.nextLine();
	System.out.println("Enter your accountno:");
	accountno=sc.nextLine();
	System.out.println("Enter your address:");
	address=sc.nextLine();
	BankAccount ba=new BankAccount(5000);
	ba.createAccount(accountno,name,address);
	ba.showAccount();
	BankAccount ba1=new BankAccount(15000.0);
	ba1.createAccount(accountno,name,address);
	ba1.showAccount();
	ba.deposit(100000);
}
}
