
public class DemoSleep extends Thread {
public void run() {
	for(int i=0;i<10;i++)
	{
		System.out.println(i);
		try
		{
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public static void main(String args[]) {
	Thread t=new DemoSleep();
	t.start();
}
}
