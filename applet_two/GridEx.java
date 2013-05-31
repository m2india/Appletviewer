/*

	Ur Class			UrClass

	Panel		=> FlowLayout
	Applet		=> FlowLayout

	Window		=> BorderLayout
	Frame		=> BorderLayout
	Dialog		=> BorderLayout

*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class GridEx  extends Applet
{
	Button b[]		= new Button[64];
//	GridLayout gl	= new GridLayout(8, 8);
	GridLayout gl	= new GridLayout(8, 8, 5, 5);

	int c		= 3;

	public void init()
	{
		setLayout(gl);

		for(int i = 0; i < b.length; i++)
		{
			b[i]	= new Button("Button  "+i);
			b[i].setBackground(new Color(100, 72, c));
			c+=3;
			add(b[i]);
		}		
	}
}

/*
	<applet code = GridEx width = 600 height = 400>
	</applet>
*/