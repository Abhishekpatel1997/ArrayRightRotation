
public class NonStaticMembersDemo {
int num;
{
	System.out.println("Inside the non static block");
}
public static void main(String[] args) {
	System.out.println("Inside the main method");
	new NonStaticMembersDemo();
	new NonStaticMembersDemo();
	new NonStaticMembersDemo();
}
static
{
	System.out.println("Inside the static block");
}
}
