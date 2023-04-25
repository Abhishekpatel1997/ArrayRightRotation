
public class App {
public static void main(String[] args) {
	int num1=10;
	int num2=90;
	System.out.println("value before swapping");
	System.out.println("====================");
	System.out.println("NUM1="+num1);
	System.out.println("NUM2="+num2);
//	int temp=num1;
//	num1=num2;
//	num2=temp;
//	System.out.println(" Value after swapping ");
//	System.out.println("===================");
//	System.out.println("NUM1="+num1);
//	System.out.println("NUM2="+num2);
	
	//without third variable swapping code
	num1=num1+num2; //90+10=100
	num2=num1-num2; //100-90=10;
	num1=num1-num2;  //100-10=90;
	System.out.println("Without the third variable");
	System.out.println("NUM2="+num2);
	System.out.println("NUM1="+num1);
}
}
