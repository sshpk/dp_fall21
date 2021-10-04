package pk.cuiatd.dp.la.q1;

public class EUCarFactory implements CarFactory{

	@Override
	public Car createMiniCar() {
		return new MiniCar(Location.EU);
	}

	@Override
	public Car createLuxuryCar() {
		return new LuxuryCar(Location.EU);
	}

}
