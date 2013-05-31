/*
	For Action

		1) import java.awt.event.*;
		2) implements particular Interface
		3) Register the Interface to Particular Component
		4) Over ride the method of the Interface
*/


import java.awt.*;
//new
// Step 1
import java.awt.event.*;
import java.applet.*;

//new
//Step 2
public class TextAction  extends Applet implements ActionListener, TextListener
{
	TextField tf1	= new TextField(10);
	TextField tf2	= new TextField(10);
	TextField tf3	= new TextField(10);

	public void init()
	{
		add(tf1);
		add(tf2);
		add(tf3);

//Step 3
		tf1.addTextListener(this);
		tf1.addActionListener(this);
	}

//Step 4
	public void textValueChanged(TextEvent e)
	{
		tf1.setBackground(Color.yellow);
//new
		tf2.setText(tf1.getText());
//new 	Applet
		showStatus(""+tf1.getColumns());
	}

//Step 4
// TextField => Enter
	public void actionPerformed(ActionEvent e)
	{
		tf1.setBackground(Color.green);
		tf3.setText(tf1.getText());
	}
}
/*
	<applet code = TextAction width = 600 height = 400>
	</applet>
*/