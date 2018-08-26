package practice;

public class Assertion {
	public static void main(String[] args)
	{
		Assertion A=new Assertion();
		A.isAgeValid(159);
	}
	public boolean isAgeValid(int age)
	{
		assert(age<150):"age not valid:"+age;
		if(age>0)
		{
			return true;
			}
		else
			{
				return false;
			}
		}
	}

