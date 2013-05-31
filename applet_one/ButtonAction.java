import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ButtonAction extends Applet implements ActionListener
{
	Button b	= new Button();	
	Button b2	= new Button("click Me");

	public void init()
	{
//new 
		b.setBackground(new Color(175, 85, 130));
		b2.setBackground(new Color(115, 225, 80));

		add(b);
		add(b2);

		b.addActionListener(this);
		b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
//new getSource()	=> Object , ActionEvent

		if(e.getSource() == b)
		{
//new
			b.setLabel("First Button");
//new
			b.setForeground(Color.white);
			setBackground(b.getBackground());
//new
			b.setFont(new Font("TimesRoman", Font.BOLD, 12));
		}
		else if(e.getSource() == b2)
		{
			b2.setLabel("Second button");
			setBackground(b2.getBackground());
		}		
//new
		doLayout();
	}
}

/*
	<applet code = ButtonAction width = 600 height = 400>
	</applet>
*/