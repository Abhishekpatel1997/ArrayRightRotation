
class A extends Thread
{
	public void run()
	{
		String n=Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(n);
			try {
				Thread.sleep(3000);
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
		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
		t1.start();
		t2.start();
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

	}

}
