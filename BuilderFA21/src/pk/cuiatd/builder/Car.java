package pk.cuiatd.builder;

public class Car {
	private final Type type;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	private double fuel = 0;
	
	public Car(Type type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator gpsNavigator) {
		super();
		this.type = type;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.tripComputer.setCar(this);
		this.gpsNavigator = gpsNavigator;
	}
	
	public Type getType() {
		return type;
	}
	public Engine getEngine() {
		return engine;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	public int getSeats() {
		return seats;
	}
	public Transmission getTransmission() {
		return transmission;
	}
	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}
	public TripComputer getTripComputer() {
		return tripComputer;
	}
}
