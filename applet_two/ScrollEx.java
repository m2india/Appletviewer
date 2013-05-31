import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ScrollEx extends Applet implements AdjustmentListener
{
	Scrollbar sb	= new Scrollbar(Scrollbar.VERTICAL, 0, 100, 0, 255);
	Scrollbar sb1	= new Scrollbar(Scrollbar.HORIZONTAL);

// Scrollbar sb		= new Scrollbar(Scrollbar.HORIZONTAL, 100, 100, 0, 255);

	public void init()
	{	
		add(sb);

		sb.addAdjustmentListener(this);		

		add(sb1);
	}

	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		showStatus(""+sb.getValue());
	}
}

/*
	<applet code = ScrollEx width = 600 height = 400>
	</applet>
*/