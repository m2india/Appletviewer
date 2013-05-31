import java.awt.*;
import java.applet.*;

public class LabelEx extends Applet
{
	Label l		=  new Label("Left");
	Label l1	=  new Label("Center");
	Label l2	=  new Label("Right");

	public void init()
	{

//new
		l.setBackground(Color.green);
		l1.setBackground(Color.blue);
		l2.setBackground(Color.green);

//new
		l.setAlignment(Label.LEFT);
		l1.setAlignment(Label.CENTER);
		l2.setAlignment(Label.RIGHT);

//new	Applet
		add(l);
		add(l1);
		add(l2);

//new
		System.out.println(l1.getText());
		l2.setText("Ispark");
	}
}

/*
	<applet code = LabelEx width = 600 height = 400>
	</applet>
*/