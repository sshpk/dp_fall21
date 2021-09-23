package pk.cuiatd.builder;

public class Demo {

	public static void main(String[] args) {
		Director director = new Director();
		
		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);
		Car car = builder.getResult();
		System.out.println("Car built is: "+car.getType());
		
		CarManualBuilder manualBuilder = new CarManualBuilder();
		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\n Car Manual built is:\n"+carManual.print());

	}

}
