import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ImageEx extends Applet 
{
	Image i;

	public void init()
	{
		i	= getImage(getCodeBase(), "1.gif"); 
	}

	public void paint(Graphics g)
	{
		//g.drawImage(i, 10, 10, this);
		g.drawImage(i, 10, 10, 300, 400, this);
	}
}

/*
	<applet code = ImageEx width = 600 height = 400>
	</applet>
*/