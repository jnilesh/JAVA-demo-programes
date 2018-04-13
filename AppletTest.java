import java.awt.*;
import java.applet.*;
public class AppletTest extends Applet
{
	public void init()
	{
	
	 setBackground(Color.YELLOW);
	setForeground(Color.RED);
	Font f = new Font("Monotype Corsiva",Font.BOLD,28);
	setFont(f);	
}	
	public void paint(Graphics g)
	{
		g.drawString("Hello All !!!",50,100);	
	}
}

/*
<applet code="AppletTest" height=300 width="300">
</applet>
*/