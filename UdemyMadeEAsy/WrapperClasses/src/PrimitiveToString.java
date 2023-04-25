
public class PrimitiveToString {
public static void main(String[] args) {
	byte b=100;
	//Primitive to String type
	String y=Byte.toString(b);
	System.out.println(y);
	
	//String to primitive
	int z=Integer.parseInt(y);
	System.out.println(z);
}
}
