
public class MyLinkedList {
	private Node first = null;
	private Node last = null;

	public void add(String element) {
		Node newNode = new Node(element);
		// when list has no node
		if (first == null) {
			first = newNode;
			last = newNode;
			return;
		}
		// when list has already nodes
		// code to add newNode into list
		last.next = newNode;
		newNode.prev = last;
		last = newNode;
	}
	public void add(int index,String element)
	{
		int x=size();
		if(index<0 || index>x)
		{
			IndexOutOfBoundsException ex=new IndexOutOfBoundsException("index: "+index+" size "+x);
			throw ex;
		}
		if(index==0)
		{
			addFirst(element);
			return;
		}
		if(index==x)
		{
		addLast(element);
		return;
		}
		Node newNode=new Node(element);
	}
	public int size()
	{
		
		if(first==null)
		{
			return 0;
		}
		int count=0;
		Node cur=first;
		while(cur!=null)
		{
			count++;
			cur=cur.next;
		}
		return count;
	}
	public void addLast(String element)
	{
		add(element);
	}
	public void addFirst(String element)
	{
		Node newNode=new Node(element);
		if(first==null)
		{
			first=newNode;
			last=newNode;
			return;
		}
		//when list not empty
		newNode.next=first;
		first.prev=newNode;
		first=newNode;
	}

	// Overriding toString()method of objects class
	public String toString() {
		if (first == null)

			return "[]";

		StringBuffer br = new StringBuffer();
		br.append("[" + first.element);
		Node curr = first.next;
		while (curr != null) {
			br.append("," + curr.element);
			curr = curr.next;
		}
		br.append("]");
		return br.toString();
	}
}
