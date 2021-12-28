package pk.cuiatd.dp.lambda.task1;

public class Demo {
	public static void main(String[] args) {
		//double[] array1 = { 17.0, 3.14, 17.0, -3.4, 17.0, 42.0, 29.2, 3.14 };
		double[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		ArrayCommand sum = (array) -> {
			double total = 0;
			for (int i = 0; i < array.length; i++) {
				total += array[i];
			}
			return total;
		};

		System.out.println(sum.apply(array1));

		ArrayCommand avg = array -> sum.apply(array) / array.length;

		System.out.println(avg.apply(array1));

		ArrayCommand max = array -> {
			double m = array[0];
			for (int i = 0; i < array.length; i++) {
				if ( array[i] > m)
					m = array[i];
			}
			return m;
		};

		System.out.println(max.apply(array1));

		ArrayCommand min = array -> {
			double m = array[0];
			for (int i = 0; i < array.length; i++) {
				if ( array[i] < m)
					m = array[i];
			}
			return m;
		};

		System.out.println(min.apply(array1));


		System.out.println(count(2).apply(array1));
	}
	public static ArrayCommand count( double value ) {
		return array -> {
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if ( array[i] == value )
					count++;
			}
			return count;
		};
	}
}
