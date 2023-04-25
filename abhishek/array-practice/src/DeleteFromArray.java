
public class DeleteFromArray {
public static void main(String[] args) {
	int A[]=new int[10];
	A[0]=5;A[1]=9;A[2]=6;A[3]=10;A[4]=12;
	A[5]=7;
	int index=2;
	for(int i=index;i<=5;i++)
	{
		A[i]=A[i+1];
	}
	for(int x:A)
	{
		System.out.print(x+" ");
	}
}
}
