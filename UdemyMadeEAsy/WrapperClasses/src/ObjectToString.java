
public class ObjectToString {
public static void main(String[] args) {
	long x=120;
	//Object to String type
	Long y=Long.valueOf(x);
	String s=y.toString();
	System.out.println(s);
	
	//String to object
	Long z=Long.valueOf(s);
	System.out.println(z);
}
}
