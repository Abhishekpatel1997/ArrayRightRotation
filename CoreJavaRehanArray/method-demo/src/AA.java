
public class AA {
public static void method1(String []y) {
	y[0]="ravi";
	y[1]="Abhishek";
	for(String n:y)
	{
		System.out.print(n+" ");
	}
	
}
public static void main(String[] args) {
	String []x=new String[] {"Amit","Rahul","Hemant","Imran"};
	
	System.out.println(x[0]+"\n"+x[1]);
	method1(x);
}
}
