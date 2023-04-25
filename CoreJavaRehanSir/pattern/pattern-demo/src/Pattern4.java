
public class Pattern4 {
public static void main(String[] args) {
	int n=7;
	
	for(int r=1;r<=n;r++)
	{
		int x=65;
		for(int c=1;c<=r;c++)
		{
			System.out.print((char)x);
			x++;
		}
		
		System.out.println();
	}
}
}
