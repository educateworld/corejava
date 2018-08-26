package multithreading;
class MultiThreadingByExtendingThread extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
MultiThreadingByExtendingThread t1=new MultiThreadingByExtendingThread();  
t1.start();  
 }  
}  
