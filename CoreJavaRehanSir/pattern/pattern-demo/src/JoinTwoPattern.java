import java.util.Scanner;
public class JoinTwoPattern {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
for(int r=1;r<=n;r++)
{
	for(int c=1;c<=r;c++)
	{
		System.out.print("*");
	}
	for(int s=n-r;s>=1;s--)
	{
		System.out.print("  ");
	}
	for(int c=1;c<=r;c++)
	{
		System.out.print("*");
	}
	System.out.println();
}
}
}
