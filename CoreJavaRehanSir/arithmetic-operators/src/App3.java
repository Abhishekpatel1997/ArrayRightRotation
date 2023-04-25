
public class App3 {
public static void main(String[] args) {
	double salary=45000;
	System.out.println("Before increment:"+salary);
//command to increase salary by 12%
//	salary=salary+salary*12/100;
// or salary=salary+salary*.12;
	salary+=salary*12/100;
	System.out.println("After increment:"+salary);
	
}
}
