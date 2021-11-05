package pk.cuiatd.dp.obs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store implements Publisher{
	List<Subscriber> subscribers = new ArrayList<Subscriber>();
	boolean inStock;
	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
		
	}
	@Override
	public void unSubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
		
	}

	@Override
	public void notifySubscribers() {
		Iterator<Subscriber> it = subscribers.iterator();
		while(it.hasNext()){
			Subscriber subscriber = it.next();
			subscriber.update();
		}
		
	}
	public void setInStock() {
		this.inStock = true;
		notifySubscribers();
	}

}
