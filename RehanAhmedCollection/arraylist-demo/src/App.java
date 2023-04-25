import java.util.ArrayList;
import java.util.List;
public class App {
public static void main(String[] args) {
	List<Object>list=new ArrayList();
	// add operation perform
	list.add(10);
	list.add("Abhishek");
	list.add(40);
	list.add("kundan");
	list.add("patel");
	list.add('A');
	list.add(5,"neeraj");
	System.out.println(list);
	//remove operation
	list.remove("kundan");
	System.out.print("after remove element "+"\n"+list+"\n");
	System.out.println(list.isEmpty());  //check isEmpty()method
	System.out.println(list.contains("neeraj")); //check list contain the given element
	System.out.println(list.get(4));
	list.set(0, "pushpa"); //set the list collectioni value in particular index
	System.out.println(list);
	System.out.println(list.size());
	List<Object>list1=new ArrayList();
	list1.add("neeraj");
	list1.add("patel");
	list1.add(2,"anshika");
	list.addAll(list1);
	System.out.println("the second list "+"\n"+list1);
	System.out.println("add all the element of list1 into list"+"\n"+list);
	//System.out.println(list.removeAll(list1)); return true or false
	list.retainAll(list1);
	System.out.println(list);
	
	
	
}
}
