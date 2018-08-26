package multithreading;

public class ThreadFirst implements Runnable {

	public void run() {
System.out.println("run method");	
for(int i=0;i<=10;i++)
{
	try {
		Thread.sleep(1000);
		//Thread.
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(i);
	
}
	}
	public static void main(String[] args) {
		ThreadFirst tf=new ThreadFirst();
		Thread t=new Thread(tf);
		Thread t2=new Thread(tf);
		Thread t3=new Thread(tf);
		t.start();
		try {
			//t.join();
			t.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

}
