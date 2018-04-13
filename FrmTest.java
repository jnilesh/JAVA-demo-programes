import java.awt.*;

class FrmTest extends Frame
{
	Label lbl;
	TextField tf;
	TextArea ta;
	Choice ch;
	List li;
	Button b;
	Checkbox c1,c2;
	CheckboxGroup cbg;
	Checkbox r1,r2;
	FrmTest()
	{
		lbl = new Label("Enter Name");	
		tf = new TextField(20);
		b = new Button("Click Me");
		ta = new TextArea(5,20);
		
		c1 = new Checkbox("Games",true);
		c2 = new Checkbox("Books",false);
		cbg = new CheckboxGroup();
		r1 = new Checkbox("male",cbg,true);
		r2 = new Checkbox("female",cbg,false);
		ch= new Choice();
		ch.add("Java");
		ch.add("CN");
		ch.add("SE");
		ch.add("WT");
		ch.add("Maths");
		add(c1);
		add(c2);
		add(r1);
		add(r2);	
	li = new List(4,true);   // multiselection === true
		li.add("WhiteBoard");
		li.add("Projector");
		li.add("Marker");
		li.add("Duster");
		li.add("Laptop");
		add(lbl);
		add(li);
		add(tf);
		add(ta);
		add(ch);
		add(b);
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout(FlowLayout.RIGHT));
	}
	public static void main(String [] args)
	{	
		new FrmTest();	
	}
} 







