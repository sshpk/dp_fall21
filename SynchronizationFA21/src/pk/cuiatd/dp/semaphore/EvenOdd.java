package pk.cuiatd.dp.semaphore;

import java.util.concurrent.Semaphore;

public class EvenOdd {
	Semaphore odd  = new Semaphore(0);
	Semaphore even = new Semaphore(0);
	EvenOdd() {
		even.release();
	}
	void printOdd() throws InterruptedException {
		for (int i = 1; i <= 10; i = i + 2) {
			even.acquire();
			System.out.print(i + " ");
			odd.release();
		}
	}
	void printEven() throws InterruptedException {
		for (int i = 2; i <= 10; i = i + 2) {
			odd.acquire();
			System.out.print(i + " ");
			even.release();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		EvenOdd printer = new EvenOdd();
		Thread t1 = new Thread() {
			public void run(){
				try {
					printer.printEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread() {
			public void run(){
				try {
					printer.printOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t1.start();
		t2.start();
	}
}
