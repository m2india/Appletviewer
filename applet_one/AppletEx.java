import java.awt.*;
import java.applet.*;

public class AppletEx extends Applet
{
	public void init()
	{
		System.out.println("Init");
	}	
	public void start()
	{
		System.out.println("Start");
	}
	public void paint(Graphics g)
	{
		System.out.println("Paint");
	}
	public void stop()
	{
		System.out.println("Stop");
	}
	public void destroy()
	{
		System.out.println("Destroy");
	}	
}

/*
	<applet code = AppletEx width = 600 height = 400>
	</applet>

  <!--  test  -->

*/