import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener {
	Label l;
	Checkbox c1, c2, c3;
	CheckboxGroup cbg;

	public MyFrame() {
		super("Check box demo");
		cbg=new CheckboxGroup();
		l = new Label("Nothing is selected");
		c1 = new Checkbox("java",false,cbg);
		c2 = new Checkbox("python",false,cbg);
		c3 = new Checkbox("C#",false,cbg);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		setLayout(new FlowLayout());
		add(l);
		add(c1);
		add(c2);
		add(c3);
	}

	public void itemStateChanged(ItemEvent e) {
		String str = "";
		if (c1.getState())
			str = str + " " + c1.getLabel();
		if (c2.getState())
			str = str + " " + c2.getLabel();
		if (c3.getState())
			str = str + " " + c3.getLabel();
		if (str.isEmpty())
			str="Nothing is selected";
			l.setText(str);

	}
}

public class Practice12 {
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		mf.setSize(300, 400);
		mf.setVisible(true);
	}
}
