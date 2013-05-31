import java.awt.*;
import java.awt.event.*;

public class FrameEx extends Frame implements WindowListener
{
	public FrameEx()
	{
//new
		setVisible(true);
//new
//		setSize(600, 400);
//		setLocation(100, 100);

		setBounds(100, 100, 600, 400);
	
		setResizable(false);

		setLayout(new FlowLayout());

		add(new Button("hai"));

		

//		setUndecorated(true);

//new
		show();
//new 
//		pack();

//new 
		addWindowListener(this);
	}

	public void paint(Graphics g)
	{
		g.drawOval(100, 100, 200, 100);
		g.setColor(Color.red);
		g.fillOval(300, 100, 200, 100);

		g.clearRect(350, 150, 30, 30);
	}

	public static void main(String args[])
	{
		FrameEx fe	= new FrameEx();
	}

	public void windowOpened(WindowEvent e)
	{
	}
	public void windowClosed(WindowEvent e)
	{
	}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowActivated(WindowEvent e)
	{
	}
	public void windowDeactivated(WindowEvent e)
	{
	}
	public void windowIconified(WindowEvent e)
	{
	}
	public void windowDeiconified(WindowEvent e)
	{
	}
}