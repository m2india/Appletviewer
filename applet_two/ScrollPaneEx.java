import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ScrollPaneEx extends Applet
{
	Button b[]		= new Button[900];
	GridLayout gl	= new GridLayout(30, 30);
	Panel p		= new Panel();
	ScrollPane sp	= new ScrollPane();

	public void init()
	{
		setLayout(new BorderLayout());
		p.setLayout(gl);

		for(int i = 0; i < b.length; i++)
		{
			b[i]	= new Button("Button "+i);
			p.add(b[i]);
		}
		sp.add(p);
		add(sp, BorderLayout.CENTER);
	}	
}

/*
	<applet code = ScrollPaneEx width = 600 height = 400>
	</applet>
*/