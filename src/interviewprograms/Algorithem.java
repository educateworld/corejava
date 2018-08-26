package interviewprograms;

public class Algorithem {
	public static int getValue(int rowIndex, int columnIndex)
	{
		  int temp=0;
		if(rowIndex==columnIndex)
		{
		 temp=1;}
		if(rowIndex==0||columnIndex==0)
		{
		temp=1;}
		if(rowIndex!=0&&columnIndex!=0&&rowIndex!=columnIndex)
		{
		if(rowIndex>columnIndex)
		{
		temp=rowIndex;
		}
		else
		{
			temp=columnIndex;
		}
		
		}
		
		return temp;
	}
	public static void main(String[] args) {
	
		int rowIndex,columnIndex;
		for(columnIndex=0;columnIndex<=3;columnIndex++)
		{
		for(rowIndex=0;rowIndex<=columnIndex;rowIndex++)
		{
			
			System.out.print(getValue(rowIndex, columnIndex));
			}
			System.out.println();
		}
		
	}

}
