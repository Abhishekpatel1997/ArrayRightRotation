public class AA {
	private int x;
	 private int y;

	public AA()// Non-parameterized constructor
	{
		// command
		System.out.println("Non parameterized constructor called");
	}

	public AA(int n1, int n2) // parameterized constructor
	{
		System.out.println("Parameterized constructor called");
		x = n1;
		y = n2;
	}
	public void showNumbers()
	{
		System.out.println("X="+x);
		System.out.println("Y="+y);
	}
}