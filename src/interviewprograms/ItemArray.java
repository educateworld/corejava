package interviewprograms;

public class ItemArray {

	public static void main(String[] args) {
		Integer item[]= {10,50,79,95,125,158,168,169,200};
		int temp = 0,itemsize=99;
		for(int i=item.length-1;item[i]>itemsize;i--)
		{
			if(item[i]>=itemsize)
			temp=item[i];
		}
		System.out.println(temp);
	}
}
