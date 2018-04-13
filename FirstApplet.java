import java.awt.*;
import java.applet.Applet;
public class FirstApplet extends Applet
{
	public void init()
	{
		setBackground(Color.GREEN);
		setForeground(Color.BLACK);
		Font f = new Font("Monotype corsiva",Font.BOLD,28);
		setFont(f);
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello Everyone !!!",150,50); // str,x,y
		g.drawLine(150,80,250,180);  // x1,y1,x2,y2
		g.drawRect(150,250,200,100);//x,y,wd,ht
		//g.setColor(Color.RED);
		g.setColor(new Color(255,0,0));
		g.fillRect(180,280,140,40);
		
	}

}
/*
<applet code="FirstApplet" height=600 width=600></applet>
*/



