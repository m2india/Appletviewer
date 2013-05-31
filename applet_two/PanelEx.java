import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PanelEx extends Applet
{
	Pane p[]	= new Pane[13];

	Color c[]	= {Color.green, Color.red, Color.orange, Color.yellow, Color.white, Color.black, Color.blue, Color.gray, Color.lightGray, Color.darkGray, Color.pink, Color.magenta, Color.cyan};
	String s[]	= {"Devi", "Hema", "Raji", "Kala", "Mala", "Usha", "Suja","Gita","Rama","Rani","Vani","Raja", "Ravi", "Vasu", "Raju","Akila"};

	public void init()
	{
		for(int i =0; i < p.length; i++)
		{
			p[i]	= new Pane(c[i]);
			for(int j = 0; j < s.length; j++)
			{
				p[i].b[j].setLabel(s[j]);
			}
			add(p[i]);
		}
	}
}

class Pane extends Panel
{
	Button b[]		= new Button[16];
	GridLayout gl	= new GridLayout(4, 4);

	public Pane(Color c)
	{
		setLayout(gl);

		for(int i = 0; i < b.length; i++)
		{
			b[i]	= new Button("Hai");
			b[i].setBackground(c);
			add(b[i]);
		}
	}
}

/*
	<applet code = PanelEx width = 600 height = 400>
	</applet>
*/