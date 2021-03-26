
public class Account {
	private long balance;
	
	public Account() {
		balance = 0;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance = balance + money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money) {
			throw new BalanceInsufficientException("ÀÜ°í ºÎÁ·: " + (money-balance));
		}
		balance = balance - money;
	}
	
}
