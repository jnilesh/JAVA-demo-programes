import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AdapterTest extends Applet // implements MouseListener
{
	public void init()
	{
		addMouseListener(new MyMouseAdapter(this));
		addKeyListener(new MKA(this));
	}
}
class MyMouseAdapter extends MouseAdapter 				 // MouseListener
{
	AdapterTest at;
	MyMouseAdapter(AdapterTest at)
	{
		this.at = at;
	}

	public void mouseClicked(MouseEvent me)
	{
		at.setBackground(Color.red);
	}
}




class MKA extends KeyAdapter
{
	AdapterTest at ;
	MKA(AdapterTest at)
	{
		this.at = at;
	}

	public void keyTyped(KeyEvent ke)
	{
			at.setBackground(Color.yellow);
	}	
}



//<applet code="AdapterTest" height=200 width=200></applet>



















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

