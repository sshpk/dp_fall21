package pk.cuiatd.dp.threadpool;

import java.util.concurrent.Callable;

public class StringReverseTask implements Callable<String> {

	String str;
	StringReverseTask(String str){
		this.str = str;
	}
	@Override
	public String call() throws Exception {
		return( new StringBuffer(str).reverse().toString());
	}
}


