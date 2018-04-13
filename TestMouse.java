import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TestMouse extends Applet implements MouseListener,MouseMotionListener
{
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	
public void mouseEntered(MouseEvent me){
showStatus("Mouse entered");
}
public void mouseExited(MouseEvent me){
showStatus("Mouse exited");
}
public void mouseClicked(MouseEvent me)
{
  showStatus("Mouse is clicked at : "+me.getX()+","+me.getY());
}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}

public void mouseMoved(MouseEvent me){
 showStatus("Mouse is at : "+me.getX()+","+me.getY());
}
public void mouseDragged(MouseEvent me){}


}
/*<applet code="TestMouse" height=200 width=200></applet>*/