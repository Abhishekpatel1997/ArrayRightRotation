 package Suspend12;

class A extends Thread
{
	public void run()
	{
		String n=Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(n);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
				//e.printStackTrace();
				System.out.println(e);
			}
		}
	}
	
}
public class B {

	public static void main(String[] args) {
		A t1=new A();
		A t2=new A();
		A t3=new A();
		t1.setName("Abhishek");
		t2.setName("Kundan");
		t3.setName("Neeraj");
		t1.start();
		t1.suspend();
		t2.start();
		//t3.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		t3.start(); 
		String n=Thread.currentThread().getName();
		for(int i=1;i<=2;i++)
		{
			System.out.println(n);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
			}
		}
t1.resume(); 
	}

}
