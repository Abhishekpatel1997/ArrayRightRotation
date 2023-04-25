
public class App {
	public static void main(String[] args) {
			int x=10,y;
			//y=x++ - ++x;
			y=++x -(x++ - ++x);
			System.out.println("X="+x);
			System.out.println("Y="+y);

	}

}
