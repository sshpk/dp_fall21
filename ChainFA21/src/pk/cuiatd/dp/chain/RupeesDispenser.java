package pk.cuiatd.dp.chain;

public class RupeesDispenser implements Dispenser{
	int worth;
	Dispenser next = null;

	public RupeesDispenser(int worth) {
		this.worth = worth;
	}

	@Override
	public void setNext(Dispenser next) {
		this.next = next;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount()>=worth){
			int quotient = currency.getAmount()/worth;
			int remainder = currency.getAmount()%worth;
			System.out.println("I am rupees "+worth+" dispenser"+
			" I am dispensing "+quotient+" notes");
			
			if((remainder!=0)&&(next!=null))
				next.dispense(new Currency(remainder));
		}
		else if (next!=null){
			next.dispense(currency);
		}
		else{
			System.out.println("The amount: "+currency.getAmount()+" cannot be processed");
		}
	}

}
