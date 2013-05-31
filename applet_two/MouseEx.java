import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class MouseEx extends Applet implements MouseListener, MouseMotionListener
{
	int x	= 0; 
	int y	= 0;
	String s	= "";
	Color c	= Color.gray;

	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void paint(Graphics g)
	{
		g.setFont(new Font("TimesRoman", Font.BOLD, 40));
		g.setColor(c);
		g.drawString(s, x, y);
	}

	public void mouseEntered(MouseEvent e)
	{
		s	= "Mouse Enter";
		x	= e.getX();
		y	= e.getY();
		c	= Color.green;

		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		s	= "Mouse Exit";
		x	= e.getX();
		y	= e.getY();
		c	= Color.blue;

		repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		s	= "Mouse Press";
		x	= e.getX();
		y	= e.getY();
		c	= Color.orange;
//		c	= Color.red;

		if(e.isAltDown())
		{
			s	= "Center Button";
		}
		else if(e.isMetaDown())
		{
			s	= "Right  Button";
		}
		else 
		{
			s	= "Left Button";
		}

		s	= ""+e.getClickCount();
		repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
		s	= "Mouse Release";
		x	= e.getX();
		y	= e.getY();
		c	= Color.blue;

		repaint();

	}
	public void mouseClicked(MouseEvent e)
	{
		s	= "Mouse Click";
		x	= e.getX();
		y	= e.getY();
		c	= Color.magenta;

		repaint();

	}

	public void mouseMoved(MouseEvent e)
	{
		s	= "Mouse Moveeee";
		x	= e.getX();
		y	= e.getY();
		c	= Color.red;

		repaint();

	}

	public void mouseDragged(MouseEvent e)
	{
		s	= "Mouse Dragggg";
		x	= e.getX();
		y	= e.getY();
		c	= Color.green;

		repaint();

	}

	public void update(Graphics g)
	{
		paint(g);
	}

}

/*
	<applet code = MouseEx width = 600 height = 400>
	</applet>
*/

/*
	repaint() => update(Graphics g) => paint(Graphics g)
*/