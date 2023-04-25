import java.util.Scanner;
public class DiscountFinder {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount");
	 int amount=sc.nextInt();
	if(amount<1000)
		System.out.println("Sorry no discount offer");
	else
	{
	double discount=0;
	/*if(amount>8000)
	{
		discount=(double)amount*.20;	
	}
	else
	{
	if(amount>=5000)
	{
		discount=amount*.15;
	}
	else
	{
	if(amount>=2500)
	{
		discount=amount*.10;
	}
	else
	{
	if(amount>=1000)
	{
		discount=amount*.05;
	}
	    }
	  }
	}*/
	//System.out.println("No discoutn offer");
	if(amount>=8000)
		discount=amount*.20;
	else if(amount>=5000)
		discount=amount*.15;
	else if(amount>=2500)
		discount=amount*.10;
	else if(amount>=1000)
		discount=amount*.05;
	
	System.out.println("the discount money is:"+discount);
	double pa=amount-discount;
	
	System.out.println("the total amount pay="+pa);
	}
}
}
