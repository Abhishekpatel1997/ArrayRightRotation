import java.util.Scanner;
public class App3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	// finds the sum of  digits of the accepted number
	int sum=0;
	int c=1;
	while(num!=0)
	{
		int x=num%10;
		
		sum=sum+(int)Math.pow(x,c++);
		num=num/10;
	}
	System.out.println("the sum of digits is "+sum);
}
}
