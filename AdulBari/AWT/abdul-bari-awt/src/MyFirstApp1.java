import java.awt.*;
import java.awt.event.*;
/*class MyFrame extends Frame //isA a mean having inheritance
{
Label l;
Button b;
TextField tf;
public MyFrame()
{
	//Frame constructor will be call and give title
	super("My First App abhishek");  
	setLayout(new FlowLayout());
	l=new Label("Name");
	tf=new TextField(30);
	b=new Button("ok");
	add(l);
	add(tf);
	add(b); 

}
}*/

//If you want every thing in one class
public class MyFirstApp1 extends Frame{
	Label l;
	Button b;
	TextField tf;
	public MyFirstApp1()
	{
		//Frame constructor will be call and give title
		super("My First App abhishek");  
		setLayout(new FlowLayout());
		l=new Label("Name");
		tf=new TextField(30);
		b=new Button("ok");
		add(l);
		add(tf);
		add(b); 

	}
public static void main(String[] args) {
	//Frame f=new Frame();//hasA mean having an object
	MyFirstApp1 f=new MyFirstApp1();
	f.setSize(300,300);
	f.setVisible(true);
}
}
