import java.awt.*;

class FrmApp extends Frame
{
	Button b1,b2;
	TextField tf;
	Label lbl;
	TextArea ta ;
	FrmApp()
	{
		b1= new Button("Ok");
		b2=new Button("Reset");
		lbl= new Label("Enter Name : ");
		tf =new TextField(20);
		ta = new TextArea(5,20);
		add(lbl);
		add(tf);
		add(ta);
		add(b1);
		add(b2);
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String []args)
	{
		new FrmApp();
	}
}

