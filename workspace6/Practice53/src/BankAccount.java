import java.util.Random;
public class BankAccount {
	private String  name, accountNo;
	private int balance;
	private double interest;
	
	public void setName(String name) { this.name = name; }
	public void setAccountNo(String accountNo) { this.accountNo = accountNo; }
	public void setBalance(int balance) {this.balance = balance;}
	public void setInterest (double interest) { this.interest = interest; }
	
	public String getName() {return name;}
	public String getAccountNo() {return accountNo;}
	public int getBalance() {return balance;}
	public double getInterest() {return interest;}
	
	public BankAccount()
	{
		this("모름",0,0);
	}
	public BankAccount(String name, int balance)
	{
		this(name,balance,0);
	}
	public BankAccount(String name, int balance, double interest)
	{
		this.name = name;
		this.balance = balance;
		this.interest = interest;
	}
	
	Random rg = new Random();
	private String makeId()
	{
		int n1 = rg.nextInt(9000) + 1000;
		int n2 = rg.nextInt(9000) + 1000;
		accountNo = n1 + "-" + n2;
		return accountNo;
	}
	private int calcInterest()
	{
		int i = (int)(balance * interest / 100);
		return i;
	}
	
	public String toString()
	{
		String rslt = "";
		accountNo = makeId();
		rslt += ("이름 : " + name + "\n");
		rslt += ("계좌 번호 : " + accountNo + "\n");
		rslt += ("잔액 : " + balance + "\n");
		rslt += ("이자율 : " + interest + "\n");
		rslt += ("이자 : " + calcInterest() + "원\n");
		return rslt;
	}
}