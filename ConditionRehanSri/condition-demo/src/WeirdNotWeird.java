
public class WeirdNotWeird {
public static void main(String[] args) {
	int n=31;
	if(n%2!=0)
	{
		System.out.println("Weird");
	}
	if(n%2==0 && n>=1 && n<=6)
	{
		System.out.println("Not weird");
	}
	if(n%2==0 && n>=7&&n<=20)
	{
		System.out.println("Weird");
	}
	if(n%2==0 && n>20)
	{
		System.out.println("Not Weird");
	}
}
}
