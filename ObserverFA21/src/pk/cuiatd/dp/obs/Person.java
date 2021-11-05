package pk.cuiatd.dp.obs;

public class Person implements Subscriber{
	String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public void update() {
		System.out.println("Hello "+name+", product is now in stock");

	}

}
