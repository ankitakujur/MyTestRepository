
public class TestMyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start inside main:)"+Thread.currentThread());
		Thread t=new MyThread();
			Thread t1 = new MyThread();
			t1.run();

			System.out.println("End: inside main with name as " + Thread.currentThread().getName());
		}
	

	}

