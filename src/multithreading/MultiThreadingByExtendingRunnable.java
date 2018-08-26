package multithreading;
class MultiThreadingByExtendingRunnable implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
//MultiThreadingByExtendingRunnable m1=new MultiThreadingByExtendingRunnable();  
Thread t1 =new Thread(new MultiThreadingByExtendingRunnable());  
t1.start();  
 }  
}  