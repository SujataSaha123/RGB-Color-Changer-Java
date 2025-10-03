import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LayoutExample extends JFrame implements ActionListener
{
    JFrame jframe;
    JButton btnRed,btnBlue,btnGreen,btnYellow,btnCyan,btnPink,btnOrange,btnBlack,btnSet;
    JPanel pnlCenter,pnlNorth,pnlSouth,pnlEast,pnlWest;
    JTextField txtRed,txtGreen,txtBlue;
    int r,g,b;
    LayoutExample()
{
 jframe=new JFrame();
 pnlNorth=new JPanel();
 pnlSouth=new JPanel();
 pnlEast=new JPanel();
 pnlWest=new JPanel();
 pnlCenter=new JPanel();
 btnRed=new JButton("RED");
 btnBlue=new JButton("BLUE");
 btnGreen=new JButton("GREEN");
 btnYellow=new JButton("YELLOW");
 btnCyan=new JButton("CYAN");
 btnPink=new JButton("PINK");
 btnOrange=new JButton("ORANGE");
 btnBlack=new JButton("BLACK");
 btnSet=new JButton("SET");
 txtRed=new JTextField("000",10);
 txtGreen=new JTextField("000",10);
 txtBlue=new JTextField("000",10);
 setLayout(new BorderLayout());
 pnlNorth.setLayout(new GridLayout(1,2));
 pnlNorth.add(btnRed);
 pnlNorth.add(btnBlue);
 pnlSouth.setLayout(new GridLayout(1,2));
 pnlSouth.add(btnGreen);
 pnlSouth.add(btnYellow);
 pnlEast.setLayout(new GridLayout(2,1));
 pnlEast.add(btnCyan);
 pnlEast.add(btnPink);
 pnlWest.setLayout(new GridLayout(2,1));
 pnlWest.add(btnOrange);
 pnlWest.add(btnBlack);
 pnlCenter.setLayout(new FlowLayout());
 pnlCenter.add(txtRed);
 pnlCenter.add(txtGreen);
 pnlCenter.add(txtBlue);
 pnlCenter.add(btnSet);
 jframe.add("North",pnlNorth);
 jframe.add("South",pnlSouth);
 jframe.add("East",pnlEast);
 jframe.add("West",pnlWest);
 jframe.add("Center",pnlCenter);
 jframe.setSize(800,500);
 jframe.setVisible(true);
 btnRed.addActionListener(this);
 btnGreen.addActionListener(this);
 btnBlue.addActionListener(this);
 btnCyan.addActionListener(this);
 btnPink.addActionListener(this);
 btnOrange.addActionListener(this);
 btnBlack.addActionListener(this);
 btnYellow.addActionListener(this);
 btnSet.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==btnRed)
    {
        pnlCenter.setBackground(Color.red);
    }
    else if(ae.getSource()==btnGreen)
    {
        pnlCenter.setBackground(Color.green);
    }
    else if(ae.getSource()==btnBlue)
    {
        pnlCenter.setBackground(Color.blue);
    }
    else if(ae.getSource()==btnYellow)
    {
        pnlCenter.setBackground(Color.yellow);
    }
    else if(ae.getSource()==btnCyan)
    {
        pnlCenter.setBackground(Color.cyan);
    }
    else if(ae.getSource()==btnPink)
    {
        pnlCenter.setBackground(Color.pink);
    }
    else if(ae.getSource()==btnOrange)
    {
        pnlCenter.setBackground(Color.orange);
    }
    else if(ae.getSource()==btnBlack)
    {
        pnlCenter.setBackground(Color.black);
    }
    else if(ae.getSource()==btnSet)
    {
       r=Integer.parseInt(txtRed.getText());
       g=Integer.parseInt(txtGreen.getText());
       b=Integer.parseInt(txtBlue.getText());
       Color clr=new Color(r,g,b);
       pnlCenter.setBackground(clr);
    }
}
public static void main(String args[]){
    new LayoutExample();
}
}