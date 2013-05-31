import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class FocusEx extends Applet implements FocusListener
{
	TextField tf	= new TextField(10);
	TextField tf1	= new TextField(10);

	public void init()
	{
		add(tf);
		add(tf1);

		tf.addFocusListener(this);
		tf1.addFocusListener(this);
	}	

	public void focusGained(FocusEvent e)
	{
		TextField t		= (TextField) e.getSource();

		t.setBackground(Color.green);
	}
	public void focusLost(FocusEvent e)
	{
		TextField t		= (TextField) e.getSource();

		t.setBackground(Color.red);
	} 
}

/*
	<applet code = FocusEx width = 600 height = 400>
	</applet>
*/