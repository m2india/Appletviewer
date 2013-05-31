import java.awt.*;
import java.applet.*;

public class Draw extends Applet
{
	public void paint(Graphics g)
	{

//new
		g.setColor(Color.black);
		g.drawLine(100, 100, 200, 100);
		g.drawLine(200, 150, 100, 150);	
		g.drawLine(100, 200, 100, 150);

//new
		g.setColor(Color.red);
		g.drawLine(100, 150, 250, 150);

		g.setColor(Color.blue);
		g.drawLine(250, 150, 250, 300);

		g.setColor(Color.green);
		g.drawLine(250, 300, 100, 300);

		g.setColor(Color.pink);
		g.drawLine(100, 300, 100, 150);


		g.setColor(Color.magenta);
		g.drawRect(300, 100, 100, 100);

		g.setFont(new Font("TimesRoman", Font.BOLD, 25));

		g.setColor(Color.pink);
			
//new 
		g.drawString("India is my country", 20, 20);
	}
}

/*
	<applet code = Draw width = 800 height = 400>
	</applet>
*/