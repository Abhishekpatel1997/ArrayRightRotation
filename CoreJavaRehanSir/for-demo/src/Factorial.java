import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
//	int num=6;
//	for(int ctr=num-1;ctr>=1;ctr--)
//	{
//		num=num*ctr;
//		System.out.println(num);
//	}
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int fact=1;
	for(int i=n;i>=1;i--)  //int i=1;i<=n;i++
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}
