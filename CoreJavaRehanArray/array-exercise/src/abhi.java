import java.util.Scanner;
public class abhi {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num[]=new int[6]; //{10,20,30,40,50,60};
	int sum=0;
	for(int i=0;i<num.length;i++)
	{
		System.out.println("enter the element "+(i+1)+":");
		num[i]=sc.nextInt();
		sum=sum+num[i];
	}
	float avg=(float)sum/num.length;
	System.out.println("sum of array is "+sum);
	System.out.println("the average of array is "+avg);
}
}
