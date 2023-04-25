import java.util.Scanner;
public class Table {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=10;i++)
	{
		sum=sum+n;
		//int result=n*i;
		System.out.println(sum);
		//System.out.println(n+"x"+i+"="+result);
	}
}
}
