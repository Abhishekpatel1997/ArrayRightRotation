
public class StaticMethod {
	static void method1()
	{
		System.out.println("Inside method1");
	}
	static
	{
		System.out.println("Inside the static block");
		method1();
	}
public static void main(String[] args) {
	System.out.println("Inside the main");
	//StaticMethod.method1();
}
}
