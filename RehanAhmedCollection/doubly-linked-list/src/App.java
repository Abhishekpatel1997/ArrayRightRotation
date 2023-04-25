//import java.util.*;
public class App {
	public static void main(String[] args) {
		// LinkedList<String> list=new LinkedList<String>();
		MyLinkedList list = new MyLinkedList();
		list.add("Rahul");
		list.add("Amit");
		list.addFirst("Imran");
		list.addFirst("Neha");
		System.out.println(list.toString());
	}
}
