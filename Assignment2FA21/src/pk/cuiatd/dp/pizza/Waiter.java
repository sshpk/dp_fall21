package pk.cuiatd.dp.pizza;
//consumer class

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Waiter implements Runnable{
	private BlockingQueue<Integer> shelf;
	public Waiter(BlockingQueue<Integer> shelf) {
		this.shelf = shelf;
	}

	@Override
	public void run() {
		//For sake of simplicity, run it in infinite loop
		while(true) {
			try{
				Thread.sleep(1500);
				//Randomly take an item from queue
				Random random = new Random();
				if(random.nextInt(10)==0) {
					/*
					 * take method will patiently wait if the queue is empty 
					 * and once the value is added it will take element out of queue
					 */
					Integer value = shelf.take();
					System.out.println(Thread.currentThread().getName() +": serving order nr. "+ value+ ". There are "+ shelf.size()+" unserved orders on the shelf");

				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


