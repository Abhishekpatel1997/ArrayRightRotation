package MultliThreading;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Abhishek");
		}
		//the multitreading is a process to executes multiple thread at a same time
		//without depending on other threads...
	}
}
public class B {
	public static void main(String[] args) {
		
	A t=new A();
	t.start();
for(int j=1;j<=5;j++)
{
	System.out.println("Delhi");
}
}
}
