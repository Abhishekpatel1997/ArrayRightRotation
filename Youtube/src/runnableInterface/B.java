package runnableInterface;
class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Delhi");
		}
	}
}
public class B {
public static void main(String[] args) {
	A r=new A();
	Thread t=new Thread(r);
	t.start();
	for(int j=1;j<=5;j++)
	{
		System.out.println("Noida");
	}
}
}
