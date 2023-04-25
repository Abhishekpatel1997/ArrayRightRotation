import java.util.*;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Neeraj");
		list.add("kundan");
		list.add("Abhishek");
		list.add("pushpa");
		list.add("Anshika");
		list.add("Ashish");
//Iterator<String> itr=list.iterator();
//
//while(itr.hasNext())
//{
//	String str=itr.next();
//	System.out.print(str+" ");
//}
		ListIterator<String> itr = list.listIterator(list.size());
		while (itr.hasPrevious()) {
			String str = itr.previous();
			System.out.print(str + " ");
		}
		list.forEach((x) -> {
			System.out.print(x + " ");
		});
//		list.forEach(System.out::print);
//		list.forEach(n->System.out.println(n));
	}

}
