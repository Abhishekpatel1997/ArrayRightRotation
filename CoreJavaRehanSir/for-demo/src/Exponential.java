import java.util.Scanner;
public class Exponential {
public static void main(String[] args) {
	/*int x=2,y=7;
	int p=x;
	for(int i=1;i<y;i++)
	{
		p=p*x;
	}
	System.out.println(p);*/
	// from user input
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of x and y");
	int x=sc.nextInt(),y=sc.nextInt();
	int p=x;
	for(int i=1;i<y;i++)
	{
		p=p*x;
	}
	System.out.println("the value of p is "+p);
}
}
