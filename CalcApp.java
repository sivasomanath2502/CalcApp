import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalcApp extends JFrame implements ActionListener
{
	JPanel toppan;
	JPanel botpan;
	JTextField txtResult;
	JButton[] btn=new JButton[35];
	String data="";
	String op="";
	double opr1,opr2,res;
	CalcApp()
	{
		setLayout(new GridLayout(2,1,10,10));
		setVisible(true);
		setSize(400,600);
		setTitle("GUI Caluculator");
		toppan=new JPanel();
		toppan.setSize(50,300);
		toppan.setLayout(new GridLayout(1,1,10,10));
		add(toppan);
		txtResult=new JTextField();
		toppan.add(txtResult);
		botpan=new JPanel();
		botpan.setSize(300,500);
		botpan.setLayout(new GridLayout(7,5,10,10));
		botpan.setBackground(Color.lightGray);
		add(botpan);
		Font font1 = new Font("SansSerif", Font.BOLD, 20); 
		txtResult.setFont(font1);
		for(int i=0;i<35;i++)
		{
			btn[i]=new JButton();
			botpan.add(btn[i]);
			btn[i].addActionListener(this);
		}
		btn[0].setText("acos");
		btn[1].setText("asin");
		btn[2].setText("atan");
		btn[3].setText("Del");
		btn[4].setText("Clr");
		btn[5].setText("cos");
		btn[6].setText("sin");
		btn[7].setText("tan");
		btn[8].setText("e^x");
		btn[9].setText("ln");
		btn[10].setText("x^y");
		btn[11].setText("xroot");
		btn[12].setText("10^x");
		btn[13].setText("1/x");
		btn[14].setText("e");
		btn[15].setText("7");
		btn[16].setText("8");
		btn[17].setText("9");
		btn[18].setText("x!");
		btn[19].setText("%");
		btn[20].setText("4");
		btn[21].setText("5");
		btn[22].setText("6");
		btn[23].setText("*");
		btn[24].setText("/");
		btn[25].setText("1");
		btn[26].setText("2");
		btn[27].setText("3");
		btn[28].setText("+");
		btn[29].setText("-");
		btn[30].setText("0");
		btn[31].setText(".");
		btn[32].setText("mod");
		btn[33].setText("pi");
		btn[34].setText("=");
		setDefaultCloseOperation(3);
	}
	public void actionPerformed(ActionEvent ae)
	{
		switch(ae.getActionCommand())
		{
			case "0":data+="0";txtResult.setText(data);repaint();break;
			case "1":data+="1";txtResult.setText(data);repaint();break;
			case "2":data+="2";txtResult.setText(data);repaint();break;
			case "3":data+="3";txtResult.setText(data);repaint();break;
			case "4":data+="4";txtResult.setText(data);repaint();break;
			case "5":data+="5";txtResult.setText(data);repaint();break;
			case "6":data+="6";txtResult.setText(data);repaint();break;
			case "7":data+="7";txtResult.setText(data);repaint();break;
			case "8":data+="8";txtResult.setText(data);repaint();break;
			case "9":data+="9";txtResult.setText(data);repaint();break;
			case ".":data+=".";txtResult.setText(data);repaint();break;
		}
		if(ae.getActionCommand().equals("+"))
		{
			opr1=Double.parseDouble(txtResult.getText());
			txtResult.setText("");
			data="";
			op="+";
		}
		if(ae.getActionCommand().equals("-"))
		{
			opr1=Double.parseDouble(txtResult.getText());
			txtResult.setText("");
			data="";
			op="-";
		}
		if(ae.getActionCommand().equals("*"))
		{
			opr1=Double.parseDouble(txtResult.getText());
			txtResult.setText("");
			data="";
			op="*";
		}
		if(ae.getActionCommand().equals("/"))
		{
			opr1=Double.parseDouble(txtResult.getText());
			txtResult.setText("");
			data="";
			op="/";
		}
		if(ae.getActionCommand().equals("mod"))
		{
			opr1=Double.parseDouble(txtResult.getText());
			txtResult.setText("");
			data="";
			op="mod";
		}
		if(ae.getActionCommand().equals("%"))
		{
			opr1=Double.parseDouble(txtResult.getText());
			txtResult.setText("");
			data="";
			op="%";
		}
		if(ae.getActionCommand().equals("x^y"))
		{
			opr1=Double.parseDouble(txtResult.getText());
			txtResult.setText("");
			data="";
			op="x^y";
		}
		if(ae.getActionCommand().equals("="))
		{
			if(op.equals("+"))
			{
				opr2=Double.parseDouble(txtResult.getText());
				res=opr1+opr2;
				txtResult.setText(res+"");
				data="";
			}
			if(op.equals("-"))
			{
				opr2=Double.parseDouble(txtResult.getText());
				res=opr1-opr2;
				txtResult.setText(res+"");
				data="";
			}
			if(op.equals("*"))
			{
				opr2=Double.parseDouble(txtResult.getText());
				res=opr1*opr2;
				txtResult.setText(res+"");
				data="";
			}
			if(op.equals("/"))
			{
				opr2=Double.parseDouble(txtResult.getText());
				res=opr1/opr2;
				txtResult.setText(res+"");
				data="";
			}
			if(op.equals("mod"))
			{
				opr2=Double.parseDouble(txtResult.getText());
				res=opr1%opr2;
				txtResult.setText(res+"");
				data="";
			}
			if(op.equals("%"))
			{
				opr2=Double.parseDouble(txtResult.getText());
				res=(opr1*opr2)/100;
				txtResult.setText(res+"");
				data="";
			}
			if(op.equals("x^y"))
			{
				opr2=Double.parseDouble(txtResult.getText());
				res=Math.pow(opr1,opr2);
				txtResult.setText(res+"");
				data="";
			}
		}
		if(ae.getActionCommand().equals("xroot"))
		{
			res=Math.sqrt(Double.parseDouble(txtResult.getText()));
			txtResult.setText(res+"");
			data="";
		}
		if(ae.getActionCommand().equals("sin"))
		{
			res=Math.sin(Double.parseDouble(txtResult.getText()));
			txtResult.setText(res+"");
			data="";
		}
		if(ae.getActionCommand().equals("cos"))
		{
			res=Math.cos(Double.parseDouble(txtResult.getText()));
			txtResult.setText(res+"");
			data="";
		}
		if(ae.getActionCommand().equals("tan"))
		{
			res=Math.tan(Double.parseDouble(txtResult.getText()));
			txtResult.setText(res+"");
			data="";
		}
		if(ae.getActionCommand().equals("asin"))
		{
			res=Math.asin(Double.parseDouble(txtResult.getText()));
			txtResult.setText(res+"");
			data="";
		}
		if(ae.getActionCommand().equals("acos"))
		{
			res=Math.acos(Double.parseDouble(txtResult.getText()));
			txtResult.setText(res+"");
			data="";
		}
		if(ae.getActionCommand().equals("atan"))
		{
			res=Math.atan(Double.parseDouble(txtResult.getText()));
			txtResult.setText(res+"");
			data="";
		}
		if(ae.getActionCommand().equals("ln"))
		{
			res=Math.log(Double.parseDouble(txtResult.getText()));
			txtResult.setText(res+"");
			data="";
		}
		if(ae.getActionCommand().equals("1/x"))
		{
			double x=Double.parseDouble(txtResult.getText());
			if(x!=0)
			{
				res=1/x;
				txtResult.setText(res+"");
				data="";
			}
			else
			{
				txtResult.setText("Cannot Divide by Zero");
				data="";
			}
		}
		if(ae.getActionCommand().equals("e^x"))
		{
			res=Math.exp(Double.parseDouble(txtResult.getText()));
			txtResult.setText(res+"");
			data="";
		}
		if(ae.getActionCommand().equals("10^x"))
		{
			double x=Double.parseDouble(txtResult.getText());
			res=Math.pow(10,x);
			txtResult.setText(res+"");
			data="";
		}
		if(ae.getActionCommand().equals("x!"))
		{
			double res=1;
			double number=Double.parseDouble(txtResult.getText());
			int temp=(int)number;
			if(temp==number)
			{
				for(int i=1;i<=number;i++)
					res=res*i;
				txtResult.setText(res+"");
				data="";
			}
			else
			{
				txtResult.setText("Math Error");
				data="";
			}
		}
		if(ae.getActionCommand().equals("pi"))
		{
			res=Math.PI;
			txtResult.setText(res+"");
			data="";
		}
		if(ae.getActionCommand().equals("e"))
		{
			res=Math.E;
			txtResult.setText(res+"");
			data="";
		}
		if(ae.getActionCommand().equals("Clr"))
		{
			txtResult.setText("");
			data="";
		}
		if(ae.getActionCommand().equals("Del"))
		{
			String str=txtResult.getText();
			str=str.substring(0,str.length()-1);
			txtResult.setText(str);
			data=str;
		}
	}
	public static void main(String args[])
	{
		CalcApp ac=new CalcApp();
	}
}