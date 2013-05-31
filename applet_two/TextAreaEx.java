import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TextAreaEx extends Applet
{
	TextArea ta	= new TextArea();
	TextArea ta1	= new TextArea("Sankara College");
	TextArea ta2	= new TextArea(20, 80);
	TextArea ta3	= new TextArea("Manimaran",20, 80);
	TextArea ta4	= new TextArea("Paneer Selvam",20, 80, TextArea.SCROLLBARS_BOTH);
	TextArea ta5	= new TextArea("Madhan Raj",20, 80, TextArea.SCROLLBARS_VERTICAL_ONLY);
	TextArea ta6	= new TextArea("Rajesh",20, 80, TextArea.SCROLLBARS_HORIZONTAL_ONLY);
	TextArea ta7	= new TextArea("Murali",40, 80, TextArea.SCROLLBARS_NONE);

	Panel p		= new Panel();

	ScrollPane sp	= new ScrollPane();

	public void init()
	{
		setLayout(new BorderLayout());
	
		p.add(ta);
		p.add(ta1);
		p.add(ta2);
		p.add(ta3);
		p.add(ta4);
		p.add(ta5);
		p.add(ta6);
		p.add(ta7);
	
	
		sp.add(p);

		add(sp);
	}
}

/*
	<applet code = TextAreaEx width = 800 height = 600>
	</applet>
*/