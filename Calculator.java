/*
Amr Jamal
 */
package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class Calculator extends JFrame implements ActionListener
{ 
	private JButton zero,one,two ,three ,four ,five,six,seven,eight,nine,sum,sub,multple,div
	,tan,sin,cos,asin,acos,atan,on,x3,x2,xy,lnx,logx,clr,Ac,plus,equal,pi,d,oneoverx,xfac,sq;
	int n,i;
	double n1,n2,x=0;
	double ans;
	 private JTextField result;
	 private JPanel keys;
	 public Calculator()  { 
		 super( "Calculator" );
		 keys = new JPanel(); 
		 keys.setLayout( new GridLayout(7,5));
		 tan = new JButton("tan");
		 tan.setBackground(Color.LIGHT_GRAY);
		 tan.addActionListener(this);
         keys.add(tan);
		 asin = new JButton("sin-1");
		 asin.setBackground(Color.LIGHT_GRAY);
		 asin.addActionListener(this);
		 keys.add(asin);
	     acos = new JButton("cos-1");
	     acos.setBackground(Color.LIGHT_GRAY);
		 acos.addActionListener(this);		 
		 keys.add(acos);
		 atan = new JButton("tan-1");
		 atan.setBackground(Color.LIGHT_GRAY);
		 atan.addActionListener(this);
		 keys.add(atan);
		 on = new JButton("on");
		 on.setBackground(Color.orange);
		 on.addActionListener(this);
		 keys.add(on);
		 x3 = new JButton("x^3");
		 x3.setBackground(Color.LIGHT_GRAY);
		 x3.addActionListener(this);
		 keys.add(x3);
	     xy = new JButton("x^y");
	     xy.setBackground(Color.LIGHT_GRAY);
		 xy.addActionListener(this);
		 keys.add(xy);
		 xfac = new JButton("x!");
		 xfac.setBackground(Color.LIGHT_GRAY);
		 xfac.addActionListener(this);
		 keys.add(xfac);
		 sin = new JButton("sin");
		 sin.setBackground(Color.LIGHT_GRAY);
		 sin.addActionListener(this);
		 keys.add(sin);
		 cos = new JButton("cos");
		 cos.setBackground(Color.LIGHT_GRAY);
		 cos.addActionListener(this);
		 keys.add(cos);
		 x2 = new JButton("x^2");
		 x2.setBackground(Color.LIGHT_GRAY);
		 x2.addActionListener(this);
		 keys.add(x2);
		 oneoverx = new JButton("1/x");
		 oneoverx.setBackground(Color.LIGHT_GRAY);
		 oneoverx .addActionListener(this);
		 keys.add(oneoverx );
		 lnx = new JButton("lnx");
		 lnx.setBackground(Color.LIGHT_GRAY);
		 lnx.addActionListener(this);
		 keys.add(lnx);
		 logx = new JButton("logx");
		 logx.setBackground(Color.LIGHT_GRAY);
		 logx.addActionListener(this);
		 keys.add(logx);
		 sq = new JButton("sq");
		 sq.setBackground(Color.LIGHT_GRAY);
		 sq.addActionListener(this);
		 keys.add(sq);
		 seven = new JButton("7");
		 seven.setBackground(Color.pink);
	     seven.addActionListener(this);
		 keys.add(seven);
		 eight = new JButton("8");
		 eight.setBackground(Color.pink);
		 eight.addActionListener(this);
		 keys.add(eight);
		 nine = new JButton("9");
		 nine.setBackground(Color.pink);
		 nine.addActionListener(this);
		 keys.add(nine);
		 clr = new JButton("clr");
		 clr.setBackground(Color.LIGHT_GRAY);
		 clr.addActionListener(this);
		 keys.add(clr);
		 Ac = new JButton("Ac");
		 Ac.setBackground(Color.orange);
		 Ac.addActionListener(this);
		 keys.add(Ac);
		 four = new JButton("4");
		 four.setBackground(Color.pink);
		 four.addActionListener(this);
		 keys.add(four);
		 five = new JButton("5");
		 five.setBackground(Color.pink);
		 five.addActionListener(this);
		 keys.add(five);
		 six = new JButton("6");
		 six.setBackground(Color.pink);
		 six.addActionListener(this);
		 keys.add(six);
		 sub = new JButton("-");
		 sub.addActionListener(this);
		 sub.setBackground(Color.LIGHT_GRAY);
		 keys.add(sub);
		 div = new JButton("/");
		 div.addActionListener(this);
		 div.setBackground(Color.LIGHT_GRAY);
		 keys.add(div);
		 one = new JButton("1");
		 one.setBackground(Color.pink);
		 one.addActionListener(this);
		 keys.add(one);
		 two = new JButton("2");
		 two.setBackground(Color.pink);
		 two.addActionListener(this);
		 keys.add(two);
		 three = new JButton("3");
		 three.setBackground(Color.pink);
		 three.addActionListener(this);
		 keys.add(three);
		 sum = new JButton("+");
		 sum.setBackground(Color.LIGHT_GRAY);
		 sum.addActionListener(this);
		 keys.add(sum);
		 multple = new JButton("*");
		 multple.setBackground(Color.LIGHT_GRAY);
		 multple.addActionListener(this);
		 keys.add(multple);
		 zero = new JButton("0");
		 zero.setBackground(Color.pink);
		 zero.addActionListener(this);
		 keys.add(zero);
		 d = new JButton(".");
		 d.setBackground(Color.pink);
		 d.addActionListener(this);
		 keys.add(d);
		 pi = new JButton("pi");
		 pi.setBackground(Color.pink);
		 pi.addActionListener(this);
		 keys.add(pi);
		 plus = new JButton("+/-");
		 plus.setBackground(Color.LIGHT_GRAY);
		 plus.addActionListener(this);
		 keys.add(plus);
		 equal = new JButton("=");
		 equal.setBackground(Color.LIGHT_GRAY);
		 equal.addActionListener(this);
		 keys.add(equal);                                   
	 result = new JTextField("");
	 result.setHorizontalAlignment(JTextField.RIGHT);
	 Font font1 = new Font("SansSerif", Font.BOLD, 50);
	 result.setFont(font1);
	 add(result, BorderLayout.NORTH); 
	 add(keys, BorderLayout.CENTER);
	 } 
	 
 public void actionPerformed(ActionEvent ae)
	  {
	 if(ae.getSource()==d)
	 {
	 if(((result.getText()).indexOf("."))==-1)
	 result.setText(result.getText()+".");
	 }
	 if(ae.getSource()==plus)
	 {
	 if(x==0){
		 
	 
	 result.setText("-"+result.getText());
	 x=1;
	 }
	 else
		 result.setText("-"+result.getText());
	 }
	  if(ae.getSource()==on)
	  {                                            		 
		  result.setText("0");
	  }
	  if(ae.getSource()==sum) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=1;
	  result.setText("");
	  }
	  if(ae.getSource()==sub) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=2;
	  result.setText("");
	  }
	  if(ae.getSource()==multple) {
	  n1=Double.parseDouble(result.getText());
	  i=3;
	  result.setText("");
	  }
	  if(ae.getSource()==div) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=4;
	  result.setText("");
	  }
	  if(ae.getSource()==clr) 
	  {
	  result.setText("0");
	  }
	  if(ae.getSource()==cos) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=5;
	  }
	  if(ae.getSource()==cos) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=5;
	  }
	  if(ae.getSource()==sin)
	  {
	  n1=Double.parseDouble(result.getText());
	  i=6;
	  }
	  if(ae.getSource()==tan) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=7;
	  }
	  if(ae.getSource()==x2) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=8;
	  }
	  if(ae.getSource()==x3) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=9;
	  }
	  if(ae.getSource()==xy) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=10;
	  result.setText("");
	  }
	  if(ae.getSource()==logx) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=11;
	  }
	  if(ae.getSource()==oneoverx) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=12;
	  }
	  if(ae.getSource()==sq) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=13;
	  }
	  if(ae.getSource()==atan) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=14;
	  }
	  if(ae.getSource()==asin) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=15;
	  }
	  if(ae.getSource()==acos) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=16;
	  }
	  if(ae.getSource()==lnx) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=17;
	  }
	  if(ae.getSource()==xfac) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=18;
	  
	  }
	  if(ae.getSource()==zero)
	  {
	  if(result.getText().equals("0"))
	  result.setText("0");
	  else
	  result.setText(result.getText() +"0");
	  }
	  if(ae.getSource()==one)
	  {
	  if(result.getText().equals("0"))
	  result.setText("1");
	  else
	  result.setText(result.getText() +"1");
	  }
	  if(ae.getSource()==two)
	  {
	  if(result.getText().equals("0"))
	  result.setText("2");
	  else
	  result.setText(result.getText() +"2");
	  }
	  if(ae.getSource()==three)
	  {
	  if(result.getText().equals("0"))
	  result.setText("3");
	  else
	  result.setText(result.getText() +"3");
	  }
	  if(ae.getSource()==four)
	  {
	  if(result.getText().equals("0"))
	  result.setText("4");
	  else
	  result.setText(result.getText() +"4");
	  }
	  if(ae.getSource()==five)
	  {
	  if(result.getText().equals("0"))
	  result.setText("5");
	  else
	  result.setText(result.getText() +"5");
	  }
	  if(ae.getSource()==six)
	  {
	  if(result.getText().equals("0"))
	  result.setText("6");
	  else
	  result.setText(result.getText() +"6");
	  }
	  if(ae.getSource()==seven)
	  {
	  if(result.getText().equals("0"))
	  result.setText("7");
	  else
	  result.setText(result.getText() +"7");
	  }
	  if(ae.getSource()==eight)
	  {
	  if(result.getText().equals("0"))
	  result.setText("8");
	  else
	  result.setText(result.getText() +"8");
	  }
	  if(ae.getSource()==nine)
	  {
	  if(result.getText().equals("0"))
	  result.setText("9");
	  else
	  result.setText(result.getText() +"9");
	  }
	  if(ae.getSource()==pi)
	  {
	  if(result.getText().equals("0"))
	  result.setText("3.14");
	  else
	  result.setText(result.getText() +"3.14");
	  }
	  if(ae.getSource()==Ac) 
	  {
		  result.setText("");
	  }
	  if(ae.getSource()==equal) 
	  {
	  n2=Double.parseDouble(result.getText());
	  switch(i)
	  {
	  case 1:
	  {
		 
	     ans=n1+n2;
		 result.setText(Double.toString(ans)); 
	     n1=0;
	     n2=0;
	  }
	  break;
	  case 2:
	  {
	  ans=n1-n2;
	  result.setText(Double.toString(ans));
	  n1=0;
	  n2=0;
	  }
	  break;
	  case 3:
	  {
	  ans=n1*n2;
	  result.setText(Double.toString(ans));
	  n1=0;
	  n2=0;
	  }
	  break;
	  case 4:
	  {
	  ans=n1/n2;
	  result.setText(Double.toString(ans));
	  n1=0;
	  n2=0;
	  }
	  break;
	  case 5:
	  {
		  ans=Math.cos(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
	  }
	  break;
	  case 6:
	  {
		  ans=Math.sin(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
	  }
	  break;
	  case 7:
	  {
		  ans=Math.tan(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
	  }
	  break;
	  case 8:
	  {
		  ans=Math.pow(n1,2);
		  result.setText(Double.toString(ans));
		  n1=0;
	  }
	  break;
	  case 9:
	  {
		  ans=Math.pow(n1,3);
		  result.setText(Double.toString(ans));
		  n1=0;
	  }
	  break;
	  case 10:
	  {
		  ans=Math.pow(n1,n2);
		  result.setText(Double.toString(ans));
		  n1=0;
		  n2=0;
	  }
	  break;
	  case 11:
	  {
		  ans=Math.log10(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 12:
	  {
		  ans=(1/n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 13:
	  {
		  ans=Math.sqrt(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 14:
	  {
		  ans=Math.atan(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 15:
	  {
		  ans=Math.asin(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 16:
	  {
		  ans=Math.acos(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 17:
	  {
		  ans=Math.log(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 18:
	  {
		  int fac=1;
		  for(int i=1;i<=n1;i++){
		  fac*=i;
		  }
		  result.setText(Double.toString(fac));
		  n1=0;
		
	  }
	  break;
	  }}
	  
	  
	  }										
	public static void main( String[] args ) { 
		Calculator test = new Calculator();
		test.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		 test.setSize( 700, 800);
		  test.setVisible( true );  
	}
}