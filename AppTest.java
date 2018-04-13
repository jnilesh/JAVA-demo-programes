import java.awt.*;

class AppTest
{
	public static void main(String []args)
	{	
		Frame frm = new Frame();
		Button b = new Button("Ok");
		frm.add(b);
		frm.setLayout(new FlowLayout());
		frm.setSize(400,400);
		frm.setVisible(true);
	}
}