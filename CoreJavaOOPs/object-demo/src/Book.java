
public class Book {
	private int bookid;
	private String title;
	private String author;
	private int copies;
	private int price;

	public Book(int a1, String a2, String a3, int a4, int a5) {
		System.out.println("Bookid before initialization "+bookid);
		bookid = a1;
		System.out.println("Bookid after initialization "+bookid);
		title = a2;
		author = a3;
		copies = a4;
		price = a5;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bid) {
		bookid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String t) {
		title = t;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String a) {
		author = a;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int c) {
		copies = c;
	}

	public int getPrice() {
		return price;
	}

	public void setPtice(int p) {
		price = p;
	}
}
