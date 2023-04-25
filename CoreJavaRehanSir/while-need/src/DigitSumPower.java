import java.util.Scanner;
public class DigitSumPower {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int sum=0;
	int count=1;
	while(num!=0)
	{
		
		/*int rem=num%10;
	int pv=(int)Math.pow(rem,p);
	sum=sum+pv;
	num=num/10;
	p++;*/
		int rem=num%10;
		sum=sum+(int)Math.pow(rem,count);
		num=num/10;
		count++;
	}
	System.out.println("digit power sum is "+sum);
}
}
