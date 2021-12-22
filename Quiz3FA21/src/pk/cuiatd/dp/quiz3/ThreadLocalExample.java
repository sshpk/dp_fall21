package pk.cuiatd.dp.quiz3;
class MyThread2 extends Thread
{
	ThreadLocal<Integer> local = new ThreadLocal<Integer>();
	int counter = 0;
	@Override
	public void run() {
		if(local.get()!=null){
			for(int i=0;i<=7;i++)
				local.set(local.get().intValue()+1);
		}else{
			local.set(35);
		}
		for(int i=0;i<=4;i++)
			counter++;

		System.out.println("local = "+local.get());
	}
}
public class ThreadLocalExample {
	public static void main(String[] args) throws InterruptedException {
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
	}
}
