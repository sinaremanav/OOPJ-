
class MyThread extends Thread
{
public void run() {
	System.out.println("Thread is running");
}
public void cath() {
	System.out.println("Catch method is running");
}
}
public class Main  {
	public static void main(String args[]) {
		MyThread t1 =new MyThread();
		MyThread t2 =new MyThread();

		t1.start();
t2.start();
}
}
		