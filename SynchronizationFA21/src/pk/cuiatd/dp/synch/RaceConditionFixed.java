package pk.cuiatd.dp.synch;

class Counter  implements Runnable{
	private int counter = 0;

	public void increment() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		counter++;
	}

	public void decrement() {    
		counter--;
	}

	public int getValue() {
		return counter;
	}

	@Override
	public void run() {
		synchronized(this){
			//incrementing
			this.increment();
			System.out.println("Value for "+Thread.currentThread().getName()+" after increment: " +this.getValue());
			//decrementing
			this.decrement();
			System.out.println("Value for "+Thread.currentThread().getName()+" at the end: " +this.getValue());
		}
	}
}

public class RaceConditionFixed {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread t1 = new Thread(counter, "Thread-1");
		Thread t2 = new Thread(counter, "Thread-2");
		Thread t3 = new Thread(counter, "Thread-3");
		t1.start();
		t2.start();
		t3.start();
	}    
}
