import java.util.Scanner;
public class DisplayDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int s=0;
	while(num!=0)
	{
		int r=num%10;
		num=num/10;
	s=s*10+r;
		System.out.print(r);
	}
	System.out.println("\n"+s);
}
}
