package pk.cuiatd.dp.la.q1;

public class LuxuryCar extends Car { 
	LuxuryCar(Location location) { 
		super(CarType.LUXURY, location); 
		construct(); 
	} 
	@Override
	protected void construct() { 
		System.out.println("Creating a luxury car"); 
	} 
} 
