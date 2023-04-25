
public class Pattern2 {
public static void main(String[] args) {
	int n=7;
	int x=65;
	for(int r=1;r<=n;r++)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print((char)x);
		}
		x++;
		System.out.println();
	}
}
}
