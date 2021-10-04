package pk.cuiatd.dp.la.q1;

class MiniCar extends Car { 
	MiniCar(Location location) { 
		super(CarType.MINI,location ); 
		construct(); 
	} 

	@Override
	void construct() { 
		System.out.println("Creating a Mini car"); 
	} 
} 
