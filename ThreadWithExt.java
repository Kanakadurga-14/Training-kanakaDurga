package files;

public class ThreadWithExt extends Thread
{
 public void run()
 {
	 System.out.println("the run method is running");
	 }
public static void main(String[] args)
{
	ThreadWithExt  mythread= new ThreadWithExt();
	 mythread.start();
	 for(int i=0;i<9;i++)
	 {
	 System.out.println("the start method is running");
	 }
}
private void start() {
	// TODO Auto-generated method stub
	
}
	
}