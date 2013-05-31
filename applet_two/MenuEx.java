import java.awt.*;
import java.awt.event.*;

public class MenuEx extends Frame
{
	MenuBar mb		= new MenuBar();

	Menu m1			= new Menu("File");
		MenuItem m11	= new MenuItem("New");
		MenuItem m12	= new MenuItem("Open");
		MenuItem m13	= new MenuItem("Save");
		MenuItem m14	= new MenuItem("Exit");
		
	Menu m2			= new Menu("Edit");
		MenuItem m21	= new MenuItem("Cut");
		MenuItem m22	= new MenuItem("Copy");
		MenuItem m23	= new MenuItem("Paste");
		MenuItem m5	= new MenuItem("-");
		MenuItem m24	= new MenuItem("Clear");

	public MenuEx()
	{
		setVisible(true);
		setSize(600, 400);

		m1.add(m11);	
		m1.add(m12);
		m1.add(m13);
		m1.addSeparator();
		m1.add(m14);

		m14.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							System.exit(0);
						}
					}
				);

		m2.add(m21);	
		m2.add(m22);
		m2.add(m23);
		m2.add(m5);
		m2.add(m24);

		mb.add(m1);
		mb.add(m2);

		setMenuBar(mb);
	}

	public static void main(String args[])
	{
		MenuEx me	= new MenuEx();
	}
}