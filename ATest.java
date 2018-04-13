import java.awt.*;

class FrmReTest extends Frame
{
	Button b1,b2;
	TextField tf ;
	TextArea ta;
	Label lbl;
	FrmReTest()
	{
		b1 = new 	Button("Submit");
		b2 = new 	Button("Reset");
		tf = new TextField(20);
		ta =new TextArea(6,20)
		lbl = new Label("Enter Details ");
		
		add(lbl);
		add(tf);
		add(ta);
		add(b1);
		add(b2);
	

	}

	public static void main(String [] args)
	{
		new FrmReTest();
	}
}