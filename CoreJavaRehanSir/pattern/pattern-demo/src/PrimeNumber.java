import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int s=(int)Math.sqrt(n);
int flag=1;
for(int c=2;c<=n/2;c++)
{
	if(n%c==0)
	{
		System.out.println("the number is not prime");
		flag=0;
		break;
	}
}
if(flag==1)
{
	System.out.println("the number is prime");
}
}
}
