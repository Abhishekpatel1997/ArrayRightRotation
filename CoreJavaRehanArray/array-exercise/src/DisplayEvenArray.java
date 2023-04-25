
public class DisplayEvenArray {
	public static void main(String[] args) {
		//code to finds even and odds
		int even=0;
		int n[] = new int[] { 3, 4, 12, 11, 14, 19, 40 };
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==0)
				//System.out.println(n[i]);
				even++;
		}
		System.out.println("Total evens are:"+even);
		System.out.println("Total odds are:"+(n.length-even));

	}
}
