import java.util.Scanner;
public class App {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	//show last digit of accepted number
	int x=num%10;
	System.out.println("the last digi is:"+x);
	num=num/10;
	x=num%10;
	System.out.println("the second last digit is "+x);
}
}
