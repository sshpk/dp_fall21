package pk.cuiatd.dp.pizza;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class Demo {

	public static void main(String[] args) {
		BlockingQueue<Integer> shelf = new ArrayBlockingQueue<Integer>(3);

		Cook cook = new Cook(shelf);
		Waiter waiter = new Waiter(shelf);

		Thread c = new Thread(cook, "Cook");
		Thread w1 = new Thread(waiter, "Waiter 1");
		Thread w2 = new Thread(waiter, "Waiter 2");
		

		c.start();
		w1.start();
		w2.start();
		// wait for threads to end
		try {
			c.join();
			w1.join();
			w2.join();
		} catch (Exception e) {
			System.out.println("Main thread is interrupted");
		}

	}

}
