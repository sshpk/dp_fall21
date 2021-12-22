package pk.cuiatd.dp.pizza;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

// producer class
public class Cook implements Runnable{
	private BlockingQueue<Integer> shelf;
	public Cook(BlockingQueue<Integer> shelf) {
		this.shelf = shelf;
	}

	@Override
	public void run() {
		Random random = new Random();

		// For sake of simplicity, run it in infinite loop

		while (true) {
			/*
			 * put method will patiently wait once the queue is fill 
			 * and once value removed it will start re filling the queue
			 */
			try {
				Long duration = (long) (Math.random() * 10000);
				int order=random.nextInt(100);
				System.out.println(Thread.currentThread().getName() 
						+ ": time taken to prepare order nr. "+order+" = "+ + (duration / 1000) + " seconds.");
				Thread.sleep(duration);
				shelf.put(order);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
