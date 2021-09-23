package pk.cuiatd.builder;

public class Manual {
	private final Type type;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	public Manual(Type type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator gpsNavigator) {
		this.type = type;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.gpsNavigator = gpsNavigator;
	}
	public String print(){
		String info ="";
		info+="Type of the car: "+type+"\n";
		info+="No of seats in the car: "+seats+"\n";
		info+="Engine: volume "+engine.getVolume()+"; mileage - "+engine.getMileage()+"\n";
		info+="Transmission of the car: "+transmission+"\n";
		if(tripComputer!=null){
			info+= "Trip Computer: Functional \n";
		}else{
			info+= "Trip Computer: N/A \n";
		}
		
		if(gpsNavigator!=null){
			info+= "GPS Navigator: Functional \n";
		}else{
			info+= "GPS Navigator: N/A \n";
		}
		return info;
	}
	
}
