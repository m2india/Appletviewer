import java.awt.*;
import java.awt.event.*;

public class Close extends Frame
{
	public Close()
	{		
		setVisible(true);
		setSize(600, 400);
		
		addWindowListener(
				new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				}
			             );
	}

	public static void main(String args[])
	{
		Close c	= new Close();
	}
}