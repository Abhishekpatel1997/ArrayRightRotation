
public class CopyingArray {
public static void main(String[] args) {
	int []A= {2,3,4,5,6,7};
	int []B=new int[10];
	for(int i=0;i<A.length;i++)
	{
		B[i]=A[i];
		
	}
	A=B;
	B=null;
	A[6]=15;
	System.out.print(A.length);
}
}
