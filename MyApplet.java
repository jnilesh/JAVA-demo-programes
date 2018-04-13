import java.applet.*;
import java.awt.*;

public class MyApplet extends Applet
{
	public void init()
	{	
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		Font f = new Font("Monotype corsiva",Font.BOLD,35); 
		setFont(f);
	}

	public void paint(Graphics g)
	{

g.drawString("Hello EveryOne !!!",350,100);  // str,x,y
g.drawRect(10,10,100,40); // x,y,wd,ht
g.fillRect(20,20,80,20);
g.setColor(Color.YELLOW); ///x,y,wd,ht
g.fillOval(10,100,150,150);
g.drawLine(10,350,150,350); // x1,y1,x2,y2

	}

}


//<applet code="MyApplet" height=400 width="600">
//</applet>