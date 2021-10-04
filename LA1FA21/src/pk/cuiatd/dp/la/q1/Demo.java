package pk.cuiatd.dp.la.q1;

public class Demo {

	public static void main(String[] args) {
		CarFactory factory1 = new PakistanCarFactory();
		CarFactory factory2 = new EUCarFactory();
		
		System.out.println(factory1.createLuxuryCar());
		System.out.println(factory2.createMiniCar());

	}

}
