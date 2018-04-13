import java.awt.*;

class GUIApp
{
	public static void main(String args[])
	{
		Button b = new Button("Click Me");
		Frame f = new Frame();
		f.add(b);
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		f.setVisible(true);		
	}
}