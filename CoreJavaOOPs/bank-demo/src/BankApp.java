import java.util.Scanner;
public class BankApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	BankService bs=new BankService();
	System.out.println("Enter your account number");
	int num=sc.nextInt();
	bs.acceptAccountNo(num);
	while(true)
	{
		System.out.println("===================");
		System.out.println("1:view Balance");
		System.out.println("2:Deposit Money");
		System.out.println("3:Withdraw Money");
		System.out.println("4:Exit");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		if(ch==1)
		{
			bs.showBalance();
		}
		else if(ch==2)
		{
			System.out.println("enter the amount:");
			int amt=sc.nextInt();
			bs.depositMoney(amt);
		}
		else if(ch==3)
		{
			System.out.println("enter your amount");
			int amt=sc.nextInt();
			bs.withdrawMoney(amt);
		}
		else if(ch==4)
		{
			System.out.println("=================");
			System.out.println("Your session is over");
			System.out.println("=====================");
			break;
		}
		//break;
	}
}
}
