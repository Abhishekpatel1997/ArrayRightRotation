import java.util.*;
public class LinkedDemo {
public static void main(String[] args) {
LinkedList<Integer>al1=new LinkedList<Integer>();
LinkedList<Integer>al2=new LinkedList<Integer>(List.of(50,60,70,80,90));
//Iterator itr=al2.iterator();
//while(itr.hasNext()) {
//	var x=itr.next();
//	System.out.print(x+" ");
//}
//
//ListIterator<Integer>itr1=al2.listIterator(al2.size());
//while(itr1.hasPrevious())
//{
//	var y=itr1.previous();
//	System.out.print(y+" ");
//}
//for(var x:al2)
//{
//	System.out.print(x+" ");
//}
//al2.forEach((x)->
//{
//	System.out.print(x+" ");
//}
//		);
//al2.forEach(System.out::println);
//al2.forEach(n->System.out.print(n));
al1.add(10);
al1.add(0,5);
al1.addFirst(100);
al1.addLast(200);
al1.addAll(1,al2);
al1.add(5,7);
al1.forEach(n->show(n));
System.out.println(al1.firstElement());
System.out.println("the first element is:"+al1.peekFirst());

}
static void show(int n)
{
	System.out.print(n+" ");
}
}
