
public class App2 {
public static void main(String[] args) {
	int num1=4,num2=33;
	 int max=num1>num2?num1:num2;
	 int x=max;
	 while(true)
	 {
		 if(max%num1==0 && max%num2==0)
		 {
			 System.out.println(max);
			 break;
		 }
		 max=max+x;
	 }
}
}
