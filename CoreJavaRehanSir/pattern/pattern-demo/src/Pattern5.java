
public class Pattern5 {
public static void main(String[] args) {
	int n=7;
	
	for(int r=1;r<=n;r++)
	{
		char ch='A';
		for(int c=1;c<=r;c++)
		{
			System.out.print(ch);
			ch++;
		}
		
		System.out.println();
	}
}
}
