package pk.cuiatd.dp.quiz3;

public class Thread3 {
	static String message;
	private static class CorrectorThread extends Thread {
		public void run() {
			try {
				sleep(1000); 
			} catch (InterruptedException e) {}
			message = "Horses do eat oats."; 
		}
	}
	public static void main(String args[])throws InterruptedException {
		Thread t1 = new CorrectorThread();
		t1.start();
		message = "Horses do not eat oats.";
		Thread.sleep(2000);
		System.out.println(message);
	}
}
