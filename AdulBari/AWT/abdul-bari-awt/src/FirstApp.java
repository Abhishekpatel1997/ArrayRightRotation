import java.awt.*;
public class FirstApp {
public static void main(String[] args) {
	Frame f=new Frame("My First App");
	f.setLayout( new FlowLayout());
	Label l=new Label("Name");
	TextField tf=new TextField(20);
	Button b=new Button("ok");
	f.add(l);
	f.add(tf);
	
	f.add(b);
	f.setVisible(true);
	f.setSize(300,300);
	
}
}
