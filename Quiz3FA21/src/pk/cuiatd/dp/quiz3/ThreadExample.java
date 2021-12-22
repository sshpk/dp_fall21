package pk.cuiatd.dp.quiz3;

class MyThread extends Thread
{
	@Override
	public void run() {
		System.out.println("I am executed by " +currentThread().getName());
	}
}
public class ThreadExample
{
	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.run();
		myThread.start();
	}
}
