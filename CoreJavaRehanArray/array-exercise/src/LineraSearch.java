import java.util.Scanner;
public class LineraSearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
int n[]=new int[5];
int m[]=new int[5];
//int max=n[0];
for(int i=0,j=4;i<n.length;i++,j--)
{
	int max=n[0];
	System.out.println("enter the element "+(i+1)+" :");
	n[i]=sc.nextInt();
	if(n[i]>max)
	{
		max=n[i];
	}
	m[j]=max;
}
for(int x:m)
{
	System.out.print(x+" ");
}
}
}
