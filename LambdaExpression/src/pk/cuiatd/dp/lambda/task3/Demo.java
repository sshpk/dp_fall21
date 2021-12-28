package pk.cuiatd.dp.lambda.task3;

import java.util.List;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		List<Double> list = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
		list.forEach(System.out::println);
		
		list.forEach(Demo::incrementAndPrint);
		
		list.forEach(Demo::lessThanE);
		
		
	}
	public static void incrementAndPrint(Double no){
		System.out.println(no+Math.PI);
	}
	public static void lessThanE(Double no){
		if(no<Math.E)
			System.out.println(no);
		else
		System.out.println("cannot print");
	}
}
