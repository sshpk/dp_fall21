package pk.cuiatd.dp.conc;

public class Account {
	private float balance;

	public Account(float balance) {
		this.balance = balance;
	}
	public void modify(float difference){
		balance = balance+difference;
	}
	public float getBalance() {
		return balance;
	}
}
