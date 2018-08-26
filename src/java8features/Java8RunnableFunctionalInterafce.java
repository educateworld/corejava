package java8features;

import java.io.IOException;
import java.nio.CharBuffer;

public class Java8RunnableFunctionalInterafce implements Readable{
	
	public static void main(String[] args) {
		Runnable r=()->System.out.println("calling Runnable");
		Thread t=new Thread(r);
		t.start();
	}

	@Override
	public int read(CharBuffer arg0) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
