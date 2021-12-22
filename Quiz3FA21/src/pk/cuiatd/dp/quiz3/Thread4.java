package pk.cuiatd.dp.quiz3;

public class Thread4 extends Thread { 
	public void run() { 
		try { 
			Thread.sleep(1000); 
			System.out.println("Task"); 
		} catch (InterruptedException e) { 
			System.out.println("Thread interrupted"); 
		} 
	} 
	public static void main(String args[]) { 
		Thread4 t1 = new Thread4(); 
		t1.start(); 
		try { 
			t1.interrupt(); 
		} 
		catch (Exception e) { 
			System.out.println("Exception handled"); 
		} 
	} 
} 
