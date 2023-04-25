import java.util.Scanner;
public class FindElementInArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int A[]= {3,9,7,8,12,6,15,5,4,10};
	int key;
	System.out.println("enter the key");
	key=sc.nextInt();
	for(int i=0;i<A.length;i++)
	{
		if(A[i]==key)    //key==A[i] 
		{
			System.out.println("The element is found at index "+i);
			break;
		}
	}
}
}
