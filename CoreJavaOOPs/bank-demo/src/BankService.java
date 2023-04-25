
public class BankService {
Account ac=null;
public void acceptAccountNo(int no)
{
	for(int i=0;i<3;i++)
	{
		if(no==BankDb.an[i]) {
			ac=new Account(BankDb.an[i],BankDb.name[i],BankDb.amount[i]);
			break;
		}
	}
}
public void showBalance()
{
	System.out.println("==========================");
	String name=ac.getAccountHolder();
	int amount=ac.getBalanceAmount();
	System.out.println("Dear "+name+" your current balance is: "+amount);
}
public void depositMoney(int amount)
{
int balance=ac.getBalanceAmount();
 int total=balance+amount;
 ac.setBalanceAmount(total);
 String name=ac.getAccountHolder();
 System.out.println("=========================================================");
 System.out.println("Dear "+name+" amount "+amount+" is credited into your account");
}
public void withdrawMoney(int amount)
{
	int balance=ac.getBalanceAmount();
	String name=ac.getAccountHolder();
	if(amount>balance)
	{
		System.out.println("Sorry "+name+" you do not have sufficient amoutn");
	}
	else
	{
	int total=balance-amount;
	ac.setBalanceAmount(total);
	
	System.out.println("===============================");
	System.out.println("Dear "+name+" amount "+amount+" is debited from your accont");
	}
}
public static void main(String[] args) {
	BankService bs=new BankService();
	bs.showBalance();
}
}
