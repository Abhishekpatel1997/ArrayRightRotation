
public class App {
public static void main(String[] args) {
	Object arr1[]=new Object[5];
	String arr2[]=new String[5];
	arr1[0]= new String("rahul");
	arr1[1]=new Integer(10);
	arr1[2]=new Product(); 
	arr1[3]=new Customer();
	
	arr2[0]=new String("rahul");
//	arr2[1]=new Integer(10);
//	arr2[2]=new Product(); 
//	arr2[3]=new Customer();
	for(Object x:arr1)
	{
		System.out.println(x);
	}
	
}
}
