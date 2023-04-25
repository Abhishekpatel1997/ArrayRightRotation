import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number"); 
	int n=sc.nextInt();
	int tem=n;
	int rev=0;
	int count=0;
	while(tem>0)
	{
		count++;
		 tem=tem/10;
	}
	System.out.println(count);
	tem=n;
	while(n>0)
	{
		int rem=n%10;
		rev=rev+(int)Math.pow(rem,count);
		n=n/10;
	}

	System.out.println(rev);
	if(tem==rev)
	{
		System.out.println("the number "+tem+" is armstrong");
	}
	else
		System.out.println("the number "+tem+" is not armstrong");
}
}
