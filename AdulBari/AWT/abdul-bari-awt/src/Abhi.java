import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
	Label l;
	Button b;
	TextField tf;
	public MyFrame()
	{
		super("Hello Abhishek");
		l=new Label("Name");
		tf=new TextField(30);
				b=new Button("Save");
		setLayout(new FlowLayout());
		add(l);
		add(tf);
		add(b);
	}
}
public class Abhi {
public static void main(String[] args) {
	MyFrame mf=new MyFrame();
	mf.setVisible(true);
	mf.setSize(300,400);
}
}
