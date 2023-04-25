
public class App {
public static void main(String[] args) {
	int num1=4,num2=33;
	 int max=num1>num2?num1:num2;
	 int min=num1<num2?num1:num2;
	 int x=max;
	 while(true)
	 {
		 if(max%min==0)
		 {
			 System.out.println(max);
			 break;
		 }
		 max=max+x;
	 }
}
}
