import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class BorderEx extends Applet
{
//	BorderLayout bl	= new BorderLayout();
	BorderLayout bl	= new BorderLayout(20, 10);

	Button b1		= new Button("North");
	Button b2		= new Button("South");
	Button b3		= new Button("West");
	Button b4		= new Button("East");
	Button b5		= new Button("Center");

	public void init()
	{
		setLayout(bl);

		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.WEST);
		add(b4, BorderLayout.EAST);
		add(b5, BorderLayout.CENTER);		
	}
}

/*
	<applet code = BorderEx width = 800 height = 500>
	</applet>
*/