import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class BtnEvent extends Applet //implements ActionListener
{
	Button b ;
	public void init()
	{
		b= new Button("Chang BGcolor");
		addMouseListener(new MML());
		add(b);
	}
	
class MML extends MouseAdapter
{	
	public void mouseClicked(MouseEvent me)
	{
		setBackground(Color.green);
	}
}

}
//<applet code="BtnEvent" height=200 width=200></applet>