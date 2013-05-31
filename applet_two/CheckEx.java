import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CheckEx extends Applet implements ItemListener
{
	Checkbox cb	= new Checkbox("Briyani");
	Checkbox cb1	= new Checkbox("Idly");
	Checkbox cb2	= new Checkbox("Poori");
	Checkbox cb3	= new Checkbox("Sevai");

//	super class Object

	CheckboxGroup cg	= new CheckboxGroup();

	Checkbox c1	= new Checkbox("Pen", cg, true);	
	Checkbox c2	= new Checkbox("Pencil", cg, false);
	Checkbox c3	= new Checkbox("Sketch", cg, false);

	public void init()
	{
		add(cb);
		add(cb1);
		add(cb2);
		add(cb3);

		add(c1);
		add(c2);
		add(c3);

		cb.addItemListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() == cb)
		{
			setBackground(Color.green);
			showStatus(""+cb.getState());
		}
		else if(e.getSource() == cb1)
		{
			setBackground(Color.red);
			showStatus(""+cb1.getState());
		}
		else if(e.getSource() == cb2)
		{
			setBackground(Color.gray);
			showStatus(""+cb2.getState());
		}
		else if(e.getSource() == cb3)
		{
			setBackground(Color.yellow);
			showStatus(""+cb3.getState());
		}
	}
}

/*
	<applet code = CheckEx width = 600 height = 400>
	</applet>
*/