import java.util.Scanner;
public class App {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []num=new int[4];
	//loop to accept input from the user and storing the input into array
	for(int i=0;i<num.length;i++)
	{
		System.out.print("Enter the number "+(i+1)+":");
		num[i]=sc.nextInt();
	}
	for(int x:num)
	{
		System.out.print(x+" ");
	}
}
}
