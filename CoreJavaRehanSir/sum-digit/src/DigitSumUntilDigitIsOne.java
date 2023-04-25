import java.util.Scanner;

public class DigitSumUntilDigitIsOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = 0;
		/*
		 * while(num>0) { sum=sum+num%10; num=num/10; } int m=sum; int sum2=0; if(sum>9)
		 * { while(m>0) { sum2=sum2+m%10; m=m/10; } System.out.println(sum2); } else {
		 * System.out.print(sum); }
		 */
		while (true) {
			sum = 0;
			while (num != 0) {
				sum = sum + num % 10;
				num = num / 10;
			}
			if (sum < 10)
				break;
			num = sum;
		}
		System.out.println(sum);
	}
}
