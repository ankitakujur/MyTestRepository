
public class DemoPriority extends Thread {
public void run()
{
	System.out.println("Thread running..."+Thread.currentThread().getName());
}
public static void main(String args[]) {
	System.out.println("Main starts: "+Thread.currentThread().getName());
	Thread t= new DemoPriority();
	t.setPriority(MAX_PRIORITY);
	try
	{
	t.start();
	t.join();
	}
	catch(Exception  e)
	{
		e.printStackTrace();
	}
	System.out.println("Main Ends"+Thread.currentThread().getName());
	
}
}

