
public class ThisKeywordDemo {
	int x;
	ThisKeywordDemo()
	{
		System.out.println(this.x);
		System.out.println(this);
	}
public static void main(String[] args) {
	new ThisKeywordDemo();
	new ThisKeywordDemo();
}
}
//  output==0
//          ThisKeywordDemo@2626b418
//           0
//          ThisKeywordDemo@5a07e868
