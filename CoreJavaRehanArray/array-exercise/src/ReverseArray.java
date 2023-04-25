
public class ReverseArray {
public static void main(String[] args) {
	int a[]=new int[] {3,4,11,24,56,78};
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
	/*or
	 int i=0,j=a.length-1;
	 while(i>j)
	 {
	 int temp=a[i];
	 a[i]=a[j];
	 a[j]=temp;
	 i++;
	 j--
	 }
	 
	 */
}
}
