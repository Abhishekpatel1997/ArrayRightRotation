package Yield12;
class B1 extends Thread{
	public void run()
	{
		String name=Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(name);
		}
	}
}
public class A {

public static void main(String[] args) {

	B1 t1=new B1();
	B1 t2=new B1();
	B1 t3=new B1(); 
	t1.setName("t1 Thread");
	t2.setName("t2 Thread");
	t3.setName("t3 Thread");
	t1.start();
	t2.start();
	t3.start();
t2.stop();
B b=new B();
System.out.println("B class can be extended");
b.threadStart();
}
}
