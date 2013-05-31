import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Applilet extends Applet
{
	Button b	= new Button("Applet / Application");	

	public void init()
	{
		setLayout(new FlowLayout());
		add(b);
	}

	public static void main(String args[])
	{
		Frame f	= new Frame();

		Applilet a	= new Applilet();
		f.add(a);

		a.init();

		f.setVisible(true);
		f.setSize(600, 400);
		f.show();
	}
}

/*
	<applet code = Applilet width = 600 height = 400>
	</applet>
*/