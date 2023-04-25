
public class Account {
	private int accountNo;
	private String accountHolder;
	private int balanceAmount;

	public Account(int a1, String a2, int a3) {
		this.accountNo = a1;
		this.accountHolder = a2;
		this.balanceAmount = a3;
	}
	public int getAccountNo()
	{
		return accountNo;
	}
	public String getAccountHolder()
	{
		return accountHolder;
	}
	public int getBalanceAmount()
	{
		return balanceAmount;
	}
	public void setAccountNo(int no)
	{
		accountNo=no;
	}
	public void setAccountHolder(String  name)
	{
		accountHolder=name;
	}
	public void setBalanceAmount(int amt)
	{
		balanceAmount=amt;
	}
}
