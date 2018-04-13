import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class InnerTest extends Applet // implements MouseListener
{
	public void init()
	{
		addMouseListener(new MyMouseAdapter());
	}
	class MyMouseAdapter extends MouseAdapter 				 
	{
		public void mouseClicked(MouseEvent me)
		{
			setBackground(Color.red);
		}
	}
}
//<applet code="InnerTest" height=200 width=200></applet>



















// Adapter Classes

// Concrete classes and interfaces


/*
interface MouseListener
{
public abstract void mouseEntered(MouseEvent me);
public abstract void mouseExited(MouseEvent me);
public abstract void mouseClicked(MouseEvent me);
public abstract void mousePressed(MouseEvent me);
public abstract void mouseReleased(MouseEvent me);
}

class MouseAdapter implements MouseListener
{
public void mouseEntered(MouseEvent me){}
public void mouseExited(MouseEvent me){}
public void mouseClicked(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
}

KeyAdapter
KeyListener   

*/

