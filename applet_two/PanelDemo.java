import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PanelDemo extends Applet
{
	Panel p[]	= new Panel[256];

	public void init()
	{
		setLayout(new GridLayout(1, 256));
		int j= p.length; 
		for(int i = 0; i < p.length; i++)
		{
			p[i]	= new Panel();
			p[i].setBackground(new Color(43, 150, i));
			add(p[i]);
			
		}
	}
}

/*
	<applet code = PanelDemo width = 600 height = 400>
	</applet>
*/