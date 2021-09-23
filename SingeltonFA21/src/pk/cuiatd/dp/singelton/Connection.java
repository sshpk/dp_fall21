package pk.cuiatd.dp.singelton;


public class Connection {
	private static Connection INSTANCE = null;
	private Connection(){
		
	}
	public static Connection getInstance(){
		if(INSTANCE == null){
			INSTANCE = new Connection();
		}
		return INSTANCE;
	}
	public void executeQuery(){
		System.out.println("Your query has been successfully executed");
	}

}
