import java.awt.*;
import java.applet.*;

public class First extends Applet
{
//Applet method
	public void init()
	{
//new
		setBackground(Color.green);
//Applet method
		showStatus("hai");
	}

//Applet method
	public void paint(Graphics g)
	{
		setBackground(Color.yellow);
		//showStatus("hello");
	}
}

/*
	<applet code = First width = 600 height = 400>
	</applet>
*/