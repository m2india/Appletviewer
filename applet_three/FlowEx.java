import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class FlowEx extends Applet implements ActionListener
{
	Button b	= new Button("left");
	Button b1	= new Button("center");
	Button b2	= new Button("right");

	FlowLayout fl	= new FlowLayout(FlowLayout.LEFT);

	public void init()
	{
//new
		setLayout(fl);
		add(b);
		add(b1);
		add(b2);

		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b)
		{
//new
			fl.setAlignment(FlowLayout.LEFT);
		}
		else if(e.getSource() == b1)
		{
			fl.setAlignment(FlowLayout.CENTER);
		}
		else if(e.getSource() == b2)
		{
			fl.setAlignment(FlowLayout.RIGHT);
		}
		doLayout();
	}
}

/*
	<applet code = FlowEx width = 600 height = 400>
	</applet>
*/