package pk.cuiatd.abstractfactory;

public class Demo {

	public static void main(String[] args) {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if(osName.contains("mac")){
			factory = new MacFactory();
			app = new Application (factory);
		}
		else{
			factory = new WinFactory();
			app = new Application (factory);
		}
		app.paint();

	}

}
