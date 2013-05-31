import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TextEx extends Applet implements ActionListener
{
	BorderLayout bl	= new BorderLayout();

	TextArea ta	= new TextArea();

	Button b1		= new Button("Select");
	Button b2		= new Button("Select All");
	Button b3		= new Button("Selecion Start");
	Button b4		= new Button("Selecion End");
	Button b5		= new Button("Start Selecion");
	Button b6		= new Button("End Selecion");
	Button b7		= new Button("Set Selecion");
	Button b8		= new Button("Set Cursor");
	Button b9		= new Button("Get Text");
	Button b10	= new Button("Replace");

	TextField tf	= new TextField(20);
	Label l		= new Label("New Text");
	Panel top		= new Panel();

	Panel p		= new Panel();

	public void init()
	{
		ta.setFont(new Font("Century Gothic", Font.BOLD, 15));
	
		setLayout(bl);

		add(ta, BorderLayout.CENTER);

		top.add(l);
		top.add(tf);

		add(top, BorderLayout.NORTH);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);


		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);


		add(p, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			ta.select(5, 10);
		}
		else if(e.getSource() == b2)
		{
			ta.selectAll();
		}
		else if(e.getSource() == b3)
		{
			showStatus(""+ta.getSelectionStart());
		}
		else if(e.getSource() == b4)
		{
			showStatus(""+ta.getSelectionEnd());
		}
		else if(e.getSource() == b5)
		{
			ta.setSelectionStart(3);
		}
		else if(e.getSource() == b6)
		{
			ta.setSelectionEnd(15);
		}
		else if(e.getSource() == b7)
		{
			ta.select(ta.getSelectionStart(), ta.getSelectionEnd());	
		}
		else if(e.getSource() == b8)
		{
			String s	= ta.getText();
			
			int t	= s.length();

			ta.requestFocus();
			ta.setCaretPosition(t);	
		}
		else if(e.getSource() == b9)
		{
			ta.setText(ta.getSelectedText());
		}
		else if(e.getSource() == b10)
		{
			ta.replaceText(tf.getText(), ta.getSelectionStart(), ta.getSelectionEnd());
			tf.setText("");	
		}
	}
}

/*
	<applet code = TextEx width = 600 height = 400>
	</applet>
*/