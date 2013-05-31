import java.awt.*;
import java.applet.*;

public class FrameSound extends Frame
{
	public static void main(String args[])
	{
		Frame fs	= new FrameSound();
		
		Applet s		= new Sound();
		s.setBackground(Color.green);	

		fs.setVisible(true);
		fs.setSize(600, 400);
		fs.add(s);
		s.show();
		fs.show();
	}
}