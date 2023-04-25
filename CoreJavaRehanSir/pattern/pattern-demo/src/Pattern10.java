
public class Pattern10 {
public static void main(String[] args) {
int n=6;
for(int r=n;r>=1;r--)
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