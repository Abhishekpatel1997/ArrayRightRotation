
public class InsertElement {
public static void main(String[] args) {
	int A[]=new int[10];
	A[0]=5;
	A[1]=9;
	A[2]=6;
	A[3]=10;
	A[4]=12;
	A[5]=7;
	int n=6;
	int x=15;
	int index=2;
	for(int i=n;i>index;i--)
	{
		A[i]=A[i-1];
		
	}
	A[index]=x;
for(int y:A)
{
	System.out.print(y+" ");
}
}
}
