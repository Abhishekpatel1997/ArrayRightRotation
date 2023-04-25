import java.util.*;

public class ArmStrongNumber {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number ");
		for(int ctr=1;ctr<50000;ctr++)
		{
		int num=ctr;
		int sum = 0;
		int temp = num;
		int d = 0;
		while (temp > 0) {
			d++;
			temp = temp / 10;
		}
		temp = num;
		while (temp> 0) {
			int rem = temp % 10;
			sum = sum + (int) Math.pow(rem, d);
			temp = temp / 10;
		}
		if(sum==num)
			System.out.println(num);
		}
		
	}
}
