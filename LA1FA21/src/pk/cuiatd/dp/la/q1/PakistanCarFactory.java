package pk.cuiatd.dp.la.q1;

public class PakistanCarFactory implements CarFactory{

	@Override
	public Car createMiniCar() {
		return new MiniCar(Location.Pakistan);
	}

	@Override
	public Car createLuxuryCar() {
		return new LuxuryCar(Location.Pakistan);
	}

}
