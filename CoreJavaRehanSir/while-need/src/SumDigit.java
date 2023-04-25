

import java.util.Scanner;
public class SumDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int sum=0;
	int r;
	while(num!=0)
	{
		r=num%10;
		sum=sum+r;
		num=num/10;
	}
	System.out.println("sum of all the digit is "+sum);
}
}