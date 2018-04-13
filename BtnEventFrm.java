import java.awt.*;
import java.awt.event.*;

public class BtnEventFrm extends Frame implements ActionListener
{
	Button b1,b2,b3,b4 ;
	public  BtnEventFrm()
	{
		b1= new Button("Red");
		b2= new Button("Green");
		b3= new Button("Blue");
		b4= new Button("Exit");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		setSize(200,200);
		setVisible(true);
		setLayout(new FlowLayout());
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
			setBackground(Color.red);
		else if(ae.getSource()==b2)
			setBackground(Color.green);
		else if(ae.getSource()==b3)
			setBackground(Color.blue);
		else if(ae.getSource()==b4)
			System.exit(0);
	}
	public static void main(String [] args)
	{
		new BtnEventFrm();
	}
}

