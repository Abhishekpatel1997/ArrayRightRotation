package linkedlistclass;

public class LL {
	Node head = null;

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;

		}
	}

	// Method to add element at first
	public void addFirst(String data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
//method to insert element at last

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	public void printList() {
		if (head == null) {
			System.out.println("the list is empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	// program to insert the element at given position

	public void insert(int pos, String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node prev = head;
		/*
		 * for (int i = 0; i < pos - 1; i++) { prev = prev.next; }
		 */
		int temp = pos;
		if (temp < 0) {
			System.out.println("index should not be negative " + pos);
			return;
		}
		while (--temp > 0) {
			if (prev == null && temp >= 0) {
				System.out.println("you enter a invalid index " + pos);
				return;
			}
			prev = prev.next;
		}
		newNode.next = prev.next;
		prev.next = newNode;
	}

	// Method to delete element at first
	public void deleteFirst() {
		if (head == null) {
			System.out.println("the list is empty");
			return;
		}
		head = head.next;

	}
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("the list is empty");
			return;
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		Node secondLast=head;
		Node lastNode=head.next; //head.next=null ->lastNode=null
		while(lastNode.next!=null)//null.next
		{
		lastNode=lastNode.next;
		secondLast=secondLast.next;
		}
		secondLast.next=null;
		
	}

	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst("Abhishek");
		list.addFirst("kundan");
		list.addLast("Pushpa");
		list.addLast("Neeraj");
		list.insert(2, "anshika");
		list.deleteFirst();
		list.printList();
	}
}
