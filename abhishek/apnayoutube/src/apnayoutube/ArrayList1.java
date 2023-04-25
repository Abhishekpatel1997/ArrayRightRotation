package apnayoutube;
import java.util.*;
//import java.util.ArrayList.*;
public class ArrayList1 {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(1);
	list.add(4);
	list.add(45);
	list.set(1,223);
	list.add(75);
	list.add(2,90);
	list.add(3,60);
	list.remove(3);
	ListIterator<Integer> itr=list.listIterator(list.size());
	while(itr.hasPrevious())
	{
		Integer n=(Integer)itr.previous();
		System.out.print(n +" ");
	}
	
	Collections.sort(list);//it works on Integer type object
	System.out.print(list);
}
}
