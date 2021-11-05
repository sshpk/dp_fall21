package pk.cuiatd.dp.obs;

public class Demo {

	public static void main(String[] args) {
		Store store = new Store();
		Subscriber usman = new Person("Usman");
		Subscriber zeeshan = new Person("Zeeshan");
		Subscriber sami = new Person("Sami");
		
		store.subscribe(usman);
		store.subscribe(zeeshan);
		store.subscribe(sami);
		
		store.setInStock();
		
		store.unSubscribe(zeeshan);
		
		store.setInStock();
	}

}
