package string;
public class StringReverseRecursion
{
	public String reverse(String str)
	{
		//System.out.println("sub:"+str.substring(1));
		//System.out.println("at:"+str.charAt(0));
		if(str==null||str.length()<=1)
			return str;
		return reverse(str.substring(1))+str.charAt(0);
	}
	
public static void main(String[] args) {
	StringReverseRecursion sr=new StringReverseRecursion();
	System.out.println(sr.reverse("umaram"));
}
}