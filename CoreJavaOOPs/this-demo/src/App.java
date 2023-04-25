
public class App {
private int num=10;
public void show()
{ int num=90;
	System.out.println(num);
	System.out.println(this.num);
	
}
public static void main(String[] args) {
	App obj=new App();
	
	obj.show();
}
}
