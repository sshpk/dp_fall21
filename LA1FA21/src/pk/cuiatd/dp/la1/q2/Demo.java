package pk.cuiatd.dp.la1.q2;

public class Demo {
	public static void main(String[] args) {
		try {
			Printer printer = Printer.getInstance();
			System.out.println("Created a printer: "+printer);
			Printer printer2 = printer.clone();
			System.out.println("Created another printer: "+printer2);
			if(printer.equals(printer2))
				System.out.println("both printers are equal");
			else System.out.println("not equal");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
