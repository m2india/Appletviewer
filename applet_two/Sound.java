import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Sound extends Applet implements ActionListener, AudioClip
{
	Button b1	= new Button("Play");
	Button b2	= new Button("Loop");
	Button b3	= new Button("Stop");

	public void init()
	{
		add(b1);
		add(b2);
		add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		AudioClip ac	= getAudioClip(getCodeBase(), "Kandhasashti Kavasam.mp3");

		if(e.getSource() == b1)
		{
			ac.play();
		}
		else if(e.getSource() == b2)
		{
			ac.loop();
		}
		else if(e.getSource() == b3)
		{
			ac.stop();
		}		
	}

	public void play()
	{
	}

	public void loop()
	{
	}

	public void stop()
	{
	}
}

/*
	<applet code = Sound width = 600 height = 400>
	</applet>
*/