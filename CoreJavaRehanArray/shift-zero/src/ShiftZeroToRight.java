
public class ShiftZeroToRight {
public static void main(String[] args) {
	int n[]= {0,45,0,2,3,0,2,0,45,67};
	int m[]=new int[n.length];
	for(int i=0,j=0;i<n.length;i++,j++)
	{
		if(n[i]==0)
		{
			
			m[j]=n[i];
		
			
		}
	}
	
	for(int y:n)
	{
		System.out.print(y+" ");
	}
}
}
