
public class TriangleUpDownPattern {
public static void main(String[] args) {
	int n=7;
	for(int r=1;r<=n;r++)
	{
		for(int s=n-r;s>=1;s--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=r;c++)
		{
			System.out.print("* ");
		}
		
		System.out.println();
	}
	for(int r=n-1;r>=1;r--)
	{
		for(int s=n-r;s>=1;s--)
		{
			System.out.print(" ");
		}
	for(int c=r;c>=1;c--)
	{
		System.out.print("* ");
	}
	System.out.println();
	}
}
}
