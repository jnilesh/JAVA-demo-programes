import java.applet.Applet;
import java.awt.*;   // abstract windowing toolkit

public class TestApp extends Applet
{
	Image i;
	public void init()
	{
	Font f = new Font("Monotype Corsiva",Font.BOLD,25);
		setFont(f);
		setBackground(Color.PINK);
		Color c = new Color(0,0,255);	
		setForeground(c);
	i = getImage(getCodeBase(),"Bears.jpg");
	
}
	public void paint(Graphics g)
	{
	g.drawString("Hello Everyone",30,200);//str,x,y
	g.drawLine(30,300,200,300); // x1,y1,x2,y2
	g.drawRect(30,100,100,70);// x,y,wd,ht
	g.setColor(Color.black);
	g.fillRect(35,105,90,60);
	g.drawOval(30,350,100,70); //x,y,w,h
	g.fillRoundRect(30,480,150,70,10,60); //x,y,w,h,w_a,h_a	
	g.setColor(Color.RED);
	g.fillArc(30,600,100,30,180,180); //x,y,w,h,start_a,no_degrees	
	int x[]={250,30,280};  //x1,x2,x3
	int y[]={30,200,200}; // y1,y2,y3
	g.drawPolygon(x,y,3); // x-ordinates, y-ordinates,no_of_points	
	g.drawImage(i,400,400,200,200,this); //img,x,y,w,h,this
	}
}
/*
<applet code="TestApp" height =700 width="700">
</applet>
*/
