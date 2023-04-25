import java.util.Scanner;
public class NumberFactor {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	System.out.println(1);
	for(int ctr=2;ctr<=num/2;ctr++)
	{
		if(num%ctr==0)
			System.out.println(ctr);
	}
	System.out.println(num);
}
}
