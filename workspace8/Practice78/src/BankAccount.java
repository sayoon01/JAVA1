public class BankAccount {
	private String name, accountNo;
	private int balance;
	private double rate;
	
	public void setName(String n) { name = n;}
	public void setAccountNo(String aNo) { accountNo = aNo;}
	public void setBalance(int b) { balance = b;}
	public void setRate(double r) { rate = r;}
	
	public String getName() { return name;}
	public String getAccountNo() { return accountNo; }
	public int getBalance() { return balance; }
	public double getRate() { return rate; }
	
	public String toString ()
	{
		return ""+accountNo+" :: "+name+" :: "+balance+" :: "+rate+"%";
	}
	
	/*private int calcInterest() 
	{
		return (int)(rate * balance / 100);
	}*/
	
	public boolean transfer(BankAccount otherAccount, int amount) 
	{
		if(otherAccount.balance > amount)
		{
			balance -= amount;
			otherAccount.balance += amount;
			return true;
		}
		else
			return false;
	}
}
