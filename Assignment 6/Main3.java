class MyThread extends Thread{
   public void run (){
	System.out.println("Thread is Running : ");
   }
   public void walk(){
	System.out.println("Thread is Walking : ");
   }
}
public class Main3{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.start();
	}
}