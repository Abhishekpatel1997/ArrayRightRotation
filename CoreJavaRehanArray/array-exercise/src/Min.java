
public class Min {
public static void main(String[] args) {
	int n[]=new int[] {10,567,3456,78,799,567};
	int max=n[0];
	for(int i=0;i<n.length;i++)
	{
		if(n[i]>max)
		{
			max=n[i];
		}
	}
	System.out.println("the max element in array is "+max);
	
}
}
