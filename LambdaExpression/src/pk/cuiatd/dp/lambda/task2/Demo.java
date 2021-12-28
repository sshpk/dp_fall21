package pk.cuiatd.dp.lambda.task2;

import pk.cuiatd.dp.lambda.task1.ArrayCommand;

public class Demo {
	public static double sum( double[] array ){
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}
	public static double avg( double[] array ){
		return sum(array)/array.length;
	}
	public static double min( double[] array ){
		double m = array[0];
		for (int i = 0; i < array.length; i++) {
			if ( array[i] < m)
				m = array[i];
		}
		return m;
	}
	public static double max( double[] array ){
		double m = array[0];
		for (int i = 0; i < array.length; i++) {
			if ( array[i] > m)
				m = array[i];
		}
		return m;
	}
	public static double count( double[] array ){
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if ( array[i] == value )
				count++;
		}
		return count;
	}
	private static double value = 1.0;
	public static void main(String[] args) {
		//double[] array1 = { 17.0, 3.14, 17.0, -3.4, 17.0, 42.0, 29.2, 3.14 };
		double[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ArrayCommand f1 = Demo::sum;
		System.out.println(f1.apply(array1));

		ArrayCommand f2 = Demo::avg;
		System.out.println(f2.apply(array1));

		ArrayCommand f3 = Demo::max;
		System.out.println(f3.apply(array1));

		ArrayCommand f4 = Demo::min;
		System.out.println(f4.apply(array1));

		ArrayCommand f5 = Demo::count;
		System.out.println(f5.apply(array1));


	}

}
