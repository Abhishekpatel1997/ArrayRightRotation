import java.util.Scanner;
public class App2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	// show all the digits one by one of the accepted numbers
	while(num>0)
	{
		int x=num%10;
		System.out.print(x);
		num=num/10;
	}
}
}
