
import java.awt.*;
import java.applet.*;

public class TextEx1 extends Applet
{
//Default Constructor

	TextField tf	= new TextField();
	TextField tf1	= new TextField(10);
	TextField tf2	= new TextField("Mani maran");
	TextField tf3	= new TextField("madhan raj", 25);

	public void init()
	{

		tf3.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		add(tf);
		add(tf1);
		add(tf2);
		add(tf3);
	}	
}

/*
	<applet code = TextEx1 width = 600 height = 400>
	</applet>
*/