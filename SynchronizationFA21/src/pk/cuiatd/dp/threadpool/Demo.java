package pk.cuiatd.dp.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {
	public static void main(String args[]){
		ExecutorService es = Executors.newFixedThreadPool(4);
		
		Future<String> f1 = es.submit(new StringReverseTask("bse 7b"));
		Future<String> f2 = es.submit(new StringReverseTask("civic"));
		Future<String> f3 = es.submit(new StringReverseTask("rotor"));
		Future<String> f4 = es.submit(new StringReverseTask("topspot"));
		Future<String> f5 = es.submit(new StringReverseTask("a1 232 1a"));
		Future<String> f6 = es.submit(new StringReverseTask("step on no pets"));
		
		try {
			System.out.println("1. " + f1.get());
			System.out.println("2. " + f2.get());
			System.out.println("3. " + f3.get());          
			System.out.println("4. " + f4.get());
			System.out.println("5. " + f5.get());
			System.out.println("6. " + f6.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		es.shutdown();
	}
}
