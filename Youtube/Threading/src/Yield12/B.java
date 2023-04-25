package Yield12;
class Thread1 extends Thread
{
	public void run()
	{
		String n=Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(n);
			Thread.yield();
		}
	}
}
class Thread2 extends Thread
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

public class B {

	public void threadStart() {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.setName("abhishek");
		t2.setName("patel");
		t1.start();
		t2.start();
		String n=Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(n);
		}

	}

}
