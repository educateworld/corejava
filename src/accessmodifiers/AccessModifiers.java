package accessmodifiers;
 class A
{
 int a;
	int b;
    //static int b;
	 A()
	{
		System.out.println("constructor");
	}
	public void A()
		{
			System.out.println("constructor overloading");
		}
     public static void fun(int a) 
    {System.out.println("super fun");
	}
	final void checkBal()
	{ 
		//int a = 0,b = 0;
		a++;
		 b++;
		 System.out.println("a value:"+a+",B value:"+b);
	}
	// System.out.println(b);
}

public class AccessModifiers extends A {
	
	 public void fun(int a,int b)
	{super.A();
		System.out.println("access modifiers");
	}
	public static void main(String[] args) 
	{
		
		//A.fun(1);
		A a1=new A();
		a1.A();
		//a1.fun(1);
		a1.checkBal();
		A a2=new A();
		a2.checkBal();
		
	}

}
