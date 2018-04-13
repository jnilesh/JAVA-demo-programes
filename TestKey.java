import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TestKey extends Applet implements KeyListener
{
	String str =" ";
	public void init()
	{
		addKeyListener(this);
	}

public void keyTyped(KeyEvent ke)
{
	str+=ke.getKeyChar();
	repaint();
}

public void keyPressed(KeyEvent ke){}

public void keyReleased(KeyEvent ke){}

public void paint(Graphics g)
{
	g.drawString(str,10,100);
}

}


/*<applet code="TestKey" height=200 width=200></applet>*/