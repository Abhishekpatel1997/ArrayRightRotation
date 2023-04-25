package threadScheduler;
//thread scheduler is a part of JVM which executes multiple threads on a single
//processor randomly
class B extends Thread
{
	public void run()
	{
		String n=Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(n);
		}
	}
}

public class A {
public static void main(String[] args) {
	B t1=new B();
	B t2=new B();
	B t3=new B();
	t1.setName("thread 1");
	t2.setName("thread 2");
	t3.setName("thread 3");
	t1.start();
	t2.start();
	t3.start();
	String n=Thread.currentThread().getName();
	for(int i=1;i<=3;i++)
	{
		System.out.println(n);
	}
	
}
}
