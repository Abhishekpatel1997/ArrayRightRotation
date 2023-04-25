import java.util.Scanner;
public class Practice {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=5;
	for(int r=1;r<=n;r++)
	{
		for(int s=n-r;s>=1;s--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=r;c++)
		{
			System.out.print(c);
		}
		for(int c=r-1;c>=1;c--)
		{
			System.out.print(c);
		}
		System.out.println();
	}
		
}
}
