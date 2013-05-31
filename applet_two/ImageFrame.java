import java.awt.*;

public class ImageFrame extends Frame
{	
	Toolkit tk		= Toolkit.getDefaultToolkit();

	Image i		= tk.getImage("1.gif");

	public void paint(Graphics g)
	{
		g.drawImage(i, 10, 10, this);
	}

	public static void main(String args[])
	{
		ImageFrame ie	= new ImageFrame();

		ie.setVisible(true);
		ie.setSize(800, 600);
	}
}