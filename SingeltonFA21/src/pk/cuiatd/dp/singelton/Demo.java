package pk.cuiatd.dp.singelton;

public class Demo {

	public static void main(String[] args) {
		Connection conn;
		conn = Connection.getInstance();
		conn.executeQuery();

	}

}
