import java.awt.*;
import java.applet.*;

public class ButtonEx extends Applet
{
	Button b		= new Button();
	Button b2		= new Button("Press Me");

	public void init()
	{
		add(b);
		add(b2);
//new 
		System.out.println(b2.getLabel());
	}
}

/*
	<applet code =ButtonEx  width = 600 height = 400>
	</applet>
*/