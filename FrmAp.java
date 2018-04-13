import java.awt.*;
class FrmAp extends Frame
{
	Button b;
	TextField tf;
	TextArea ta;
	Label lbl;
	FrmAp()
	{
		b= new Button("Save Data");
		tf = new TextField(20);
		ta = new TextArea(5,20);
		lbl = new Label("Enter Name " );
		add(lbl);
		add(tf);
		add(ta);
		add(b);
		setLayout(new FlowLayout());
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new FrmAp();	
	}
}