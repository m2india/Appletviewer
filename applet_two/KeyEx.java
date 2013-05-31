import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class KeyEx extends Applet  implements KeyListener
{
	int x		= 100;
	int y		= 100;

	String press	= "";
	String release	= "";
	String typed	= "";

	String action	= "";

	Color c		= Color.blue;

	public void init()
	{
		addKeyListener(this);
		setBackground(Color.black);
		requestFocus();
	}

	public void paint(Graphics g)
	{
		g.setFont(new Font("TimesRoman", Font.BOLD, 25));
	
		g.setColor(Color.green);
		g.drawString(press, x, y);

		g.setColor(Color.red);
		g.drawString(release, x, y+100);		

		g.setColor(Color.yellow);
		g.drawString(typed, x, y+200);

		g.setColor(c);
		g.drawString(action, x, y+300);
	}

	public void keyPressed(KeyEvent e)
	{
		press	= ""+e.getKeyCode()+"          "+e.getKeyText(e.getKeyCode());

		if(e.isActionKey())
		{
			c	= Color.blue;
			action	= e.getKeyText(e.getKeyCode())+"  is an Action Key";
		}
		else
		{
			c	= Color.white;
			action	= e.getKeyText(e.getKeyCode())+"  is not an Action Key";
		}
		repaint();		
	}

	public void keyReleased(KeyEvent e)
	{
		release	= ""+e.getKeyCode()+"          "+e.getKeyText(e.getKeyCode());		

		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
		typed	= ""+ e.getKeyChar();

		repaint();
	}
}


/*
	<applet code = KeyEx width = 600 height = 400>
	</applet>
*/