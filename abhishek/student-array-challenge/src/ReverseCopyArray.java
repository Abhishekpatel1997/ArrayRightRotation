
public class ReverseCopyArray {
public static void main(String[] args) {
		int []A= {2,3,4,5,6,7};
		int []B=new int[10];
		for(int i=A.length-1,j=0;i>=0;i--,j++)
		{
			B[j]=A[i];
		}
		A=B;
		B=null;
		System.out.println(A.length);
		for(int y:A)
		{
			System.out.print(y+" ");
		}
}
}
