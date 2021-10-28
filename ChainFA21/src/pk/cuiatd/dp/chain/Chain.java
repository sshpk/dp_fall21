package pk.cuiatd.dp.chain;

public class Chain {
	Dispenser start;
	public Chain(){
		Dispenser rs5000 = new RupeesDispenser(5000);
		Dispenser rs1000 = new RupeesDispenser(1000);
		Dispenser rs500 = new RupeesDispenser(500);
		
		start = rs5000;
		start.setNext(rs1000);
		rs1000.setNext(rs500);
	}
	public void dispense(Currency currency){
		if(currency.getAmount()%500 == 0)
			start.dispense(currency);
		else System.out.println("The amount "+currency.getAmount()+" is not a multiple of 500");
	}
}
