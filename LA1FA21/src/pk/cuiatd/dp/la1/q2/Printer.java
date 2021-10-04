package pk.cuiatd.dp.la1.q2;


public class Printer {

	private static Printer instance = new Printer("default printer", "172.0.0.0");
	private String name;
	private String ipAddress;

	private Printer(String name, String ipAddress) {
		this.name = name;
		this.ipAddress = ipAddress;
	}
	private Printer(Printer printer){
		this.name = printer.name;
		this.ipAddress = printer.ipAddress;		
	}



	public static Printer getInstance() {
		return instance;
	}
	@Override
	protected Printer clone() throws CloneNotSupportedException {
		return new Printer(this);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Printer))
			return false;
		Printer printer2 = (Printer)obj;
		if((name.equals(printer2.getName()))&&(ipAddress.equals(printer2.getIpAddress())))
			return true;
		else return false;

	}
	

	public String getName() {
		return name;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	@Override
	public String toString() {
		return "Printer [name=" + name + ", ipAddress=" + ipAddress + "]";
	}

}

