import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class  ListEx extends Applet implements ItemListener, ActionListener
{
	List l	= new List();	
	List l1	= new List(5, true);

	Choice ch	= new Choice();
	
	String s[]	= {"Red","Green","Gray","Blue","Cyan","White","Black","Yellow", "Orange","Magenta","Pink","LightGray","DarkGray"};
	Color c[]	= {Color.red, Color.green, Color.gray, Color.blue, Color.cyan, Color.white, Color.black, Color.yellow, Color.orange, Color.magenta, Color.pink, Color.lightGray, Color.darkGray};

	public void init()
	{

		l.add("Red");
		l.add("Green");
		l.add("Gray");
		l.add("Blue");
		l.add("Cyan");
		l.add("White");
		l.add("Black");
		l.add("Yellow");
		l.add("Orange");
		l.add("Magenta");
		l.add("Pink");
		l.add("LightGray");
		l.add("DarkGray");

		for(int i = 0; i < s.length; i++)
		{
			ch.add(s[i]);
			l1.add(s[i]);
		}

		l1.addActionListener(this);

		l.addItemListener(this);		

		add(l);	
		add(ch);
		add(l1);
	}

	public void itemStateChanged(ItemEvent e)
	{
//new
		String st	= l.getSelectedItem();

		for(int i = 0; i < s.length; i++)
		{
			if(st.equals(s[i]))
				setBackground(c[i]);
		}		
	}

	public void actionPerformed(ActionEvent e)
	{
// double click
//new
		System.out.println ("action Performed");
	}
}

/*
	<applet code = ListEx width = 600 height = 400>
	</applet>
*/