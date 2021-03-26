
public class AccountEx {
	public static void main(String[] args)
	{
		Account acc = new Account();
		
		acc.deposit(4000);
		System.out.println(acc.getBalance());
		try{
			acc.withdraw(5000);
		}catch(BalanceInsufficientException e) {
			String msg = e.getMessage();
			System.out.println(msg);
			System.out.println();
			e.printStackTrace();
			
		}
	}
}
