
public class Demo {
	static Demo obj=new Demo();
	static
	{
				System.out.println(Demo.obj);
			Demo.obj=Demo.init();
				//Demo.obj=new Demo();
	}
	static Demo init()
	{
		 return new Demo();
	}
public static void main(String[] args) {
	System.out.println(Demo.obj);
}
}
//output::
//Demo@2626b418
//Demo@5a07e868