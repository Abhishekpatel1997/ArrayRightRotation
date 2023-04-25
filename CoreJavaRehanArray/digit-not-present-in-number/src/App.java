import java.util.Scanner;
public class App {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
   for(int c=0;c<=9;c++)
   {
	   int temp=n;
	   while(temp!=0)
	   {
		   int rem=temp%10;
		   if(c==rem)
			   break;
		   temp=temp/10;
	   }
	   if(temp==0)
		   System.out.println(c);
   }
}
}
