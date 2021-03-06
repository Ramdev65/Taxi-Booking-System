/*
    NAME - RAMDEV PANDEY
    ROLL NO- 18MCMC65
this is main page code to register the cab (Taxi).
it is showing one error but perfectly working (running without fail).
*/
package cabbooking;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.*;

public class CabBooking implements ActionListener,KeyListener
{
       JFrame f;
       JButton b1,b2,b3;
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l0;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
        JPanel p1,p2;
        ButtonGroup bg=new ButtonGroup();
        JRadioButton rd1,rd2;
    CabBooking()
    {
        f=new JFrame();
        f.setSize(900,600);
        f.setLayout(null);
        
        //first panel
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,900,50);
        p1.setBackground(new Color(248,148,6));
        l1=new JLabel("Welcome");
        l1.setBounds(10,10,150,30);
        l1.setFont(new Font("Serif",Font.BOLD,24));
        l2=new JLabel("Book your Taxi,Save your precious Time");
        l2.setBounds(550,10,300,30);
        l2.setFont(new Font("Serif",Font.ITALIC,18));
        p1.add(l2);
        p1.add(l1);
        
        //second panel
        p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,50,900,550);
        p2.setBackground(new Color(44,62,80));
                //LABELS
        l3=new JLabel("FIRST NAME:");
        l3.setBounds(10,70,150,20);
        l3.setFont(new Font("Serif",Font.BOLD,18));
        l3.setForeground(Color.white);
        l4=new JLabel("LAST NAME:");
        l4.setBounds(450,70,150,20);
        l4.setFont(new Font("Serif",Font.BOLD,18));
        l4.setForeground(Color.white);
        l5=new JLabel("AGE:");
        l5.setBounds(10,120,150,20);
        l5.setFont(new Font("Serif",Font.BOLD,18));
        l5.setForeground(Color.white);
        l6=new JLabel("GENDER:");
        l6.setBounds(450,120,150,20);
        l6.setFont(new Font("Serif",Font.BOLD,18));
        l6.setForeground(Color.white);
        l7=new JLabel("EMAIL ADD:");
        l7.setBounds(10,170,150,20);
        l7.setFont(new Font("Serif",Font.BOLD,18));
        l7.setForeground(Color.white);
        l8=new JLabel("MOBILE NUMBER:");
        l8.setBounds(450,170,170,20);
        l8.setFont(new Font("Serif",Font.BOLD,18));
        l8.setForeground(Color.white);
        l9=new JLabel("PICKUP LOCATION:");
        l9.setBounds(10,220,180,20);
        l9.setFont(new Font("Serif",Font.BOLD,18));
        l9.setForeground(Color.white);
        l10=new JLabel("DROP LOCATION:");
        l10.setBounds(450,220,180,20);
        l10.setFont(new Font("Serif",Font.BOLD,18));
        l10.setForeground(Color.white);
        l11=new JLabel("TAXI TYPE:");
        l11.setBounds(450,270,170,20);
        l11.setFont(new Font("Serif",Font.BOLD,18));
        l11.setForeground(Color.white);
        l12=new JLabel("NO OF PASSENGERS:");
        l12.setBounds(10,270,250,20);
        l12.setFont(new Font("Serif",Font.BOLD,18));
        l12.setForeground(Color.white);
        
            //TEXTFIELDS
        t1=new JTextField();
        t1.setBounds(200,70,170,20);
        t2=new JTextField();
        t2.setBounds(200,120,170,20);
        t3=new JTextField();
        t3.setBounds(200,170,170,20);
        t4=new JTextField();
        t4.setBounds(200,220,170,20);
        t5=new JTextField();
        t5.setBounds(200,270,170,20);
        t6=new JTextField();
        t6.setBounds(670,70,170,20);
        t7=new JTextField();
        t7.setBounds(670,170,170,20);
        
        t8=new JTextField();
        t8.setBounds(670,220,170,20);
       // t9=new JTextField();
        //t9.setBounds(170,70,170,20);
        //t10=new JTextField();
        //t10.setBounds(170,70,170,20);
        rd1 =new JRadioButton("MALE");
        rd1.setBounds(670,120,70,20);
        rd2 =new JRadioButton("FEMALE");
        rd2.setBounds(770,120,80,20);
       
        JComboBox bx1=new JComboBox(); 
        bx1.addItem(null);
        bx1.addItem("MINI");
        bx1.addItem("MICRO");
        bx1.addItem("SHARING");
        bx1.addItem("GOLD");
        bx1.addItem("PREMIUM");
        bx1.addItem("AUTO");
        bx1.setBounds(670,270,170,20);
        
        //BUTTONS
        b1=new JButton("SUBMIT");
        b1.setBackground(Color.CYAN);
        b1.setBounds(150,350,150,30);
        b1.setFont(new Font("Serif",Font.BOLD,16));
        b2=new JButton("CLEAR");
        b2.setBackground(Color.CYAN);
        b2.setBounds(310,350,150,30);
        b2.setFont(new Font("Serif",Font.BOLD,16));
        b3=new JButton("CANCEL");
        b3.setBackground(Color.CYAN);
        b3.setBounds(470,350,150,30);
        b3.setFont(new Font("Serif",Font.BOLD,16));
        
             //ADDING IN PANEL2
        p2.add(l3);
        p2.add(b1);
        p2.add(b3);
        p2.add(b2);
        p2.add(l4);
        p2.add(l5);
        p2.add(l6);
        p2.add(l7);
        p2.add(l8);
        p2.add(l9);
        p2.add(l10);
        p2.add(l11);
        p2.add(l12);
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);
        p2.add(t4);
        p2.add(t5);
        p2.add(t6);
        p2.add(t7);
        p2.add(t8);
        p2.add(rd1);
        p2.add(rd2);
        bg.add(rd1);
        p2.add(bx1);
        bg.add(rd2);
        
        rd1.addActionListener(this);
        rd2.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
	b3.addActionListener(this);
        t1.addKeyListener(this);
        t2.addKeyListener(this);
        t3.addKeyListener(this);
        t4.addKeyListener(this);
        t5.addKeyListener(this);
        t6.addKeyListener(this);
        t7.addKeyListener(this);
        t8.addKeyListener(this);
        
            
            //added panel to the frame.
        f.add(p1);
        f.add(p2);
        f.setVisible(true);
    }
    public void keyTyped(KeyEvent key)
	{
		if(key.getComponent()==t1)
		{
			char ch=key.getKeyChar();
			if(Character.isDigit(ch))
			{
				JOptionPane.showMessageDialog(f, "Only Letters Allowed");
				key.consume();
			}
		}
		else if(key.getComponent()==t2)
		{
			char ch=key.getKeyChar();
			if(Character.isLetter(ch))
			{
				JOptionPane.showMessageDialog(f,"Only Digits Allowed");
			}
		}
		
		else if(key.getComponent()==t4)
		{
			char ch=key.getKeyChar();
			if(Character.isDigit(ch))
			{
				JOptionPane.showMessageDialog(f,"Only Letters Allowed");
			}
		}
		else if(key.getComponent()==t5)
		{
			char ch=key.getKeyChar();
			if(Character.isLetter(ch))
			{
				JOptionPane.showMessageDialog(f,"Only Digits Allowed");
			}
		}
		else if(key.getComponent()==t7)
		{
			char ch=key.getKeyChar();
			if(Character.isLetter(ch))
			{
				JOptionPane.showMessageDialog(f,"Only Digits Allowed");
			}
		}
		else if(key.getComponent()==t8)
		{
			char ch=key.getKeyChar();
			if(Character.isDigit(ch))
			{
				JOptionPane.showMessageDialog(f,"Only Letters Allowed");
			}
		}
		else if(key.getComponent()==t6)
		{
			char ch=key.getKeyChar();
			if(Character.isDigit(ch))
			{
				JOptionPane.showMessageDialog(f,"Only Letters Allowed");
			}
		}
		
	}
    
    public void keyPressed(KeyEvent key)
	{
	 if (t1.getText().length() >= 1) {
          b1.setEnabled(true);
            } else {
              b1.setEnabled(false);
            }
         if (t2.getText().length() >= 1) {
          b1.setEnabled(true);
            } else {
              b1.setEnabled(false);
            }
         if (t3.getText().length() >= 1) {
          b1.setEnabled(true);
            } else {
              b1.setEnabled(false);
            }
         if (t4.getText().length() >= 1) {
          b1.setEnabled(true);
            } else {
              b1.setEnabled(false);
            }
         if (t5.getText().length() >= 1) {
          b1.setEnabled(true);
            } else {
              b1.setEnabled(false);
            }
         if (t6.getText().length() >= 1) {
          b1.setEnabled(true);
            } else {
              b1.setEnabled(false);
            }
         if (t7.getText().length() >= 1) {
          b1.setEnabled(true);
            } else {
              b1.setEnabled(false);
            }
         if (t8.getText().length() >= 1) {
          b1.setEnabled(true);
            } else {
              b1.setEnabled(false);
            }
	}
	public void keyReleased(KeyEvent key)
	{ 
		
	}
	
    public void actionPerformed(ActionEvent e)
	{
		try
		{
			File f1=new File("Booking2.txt");
			FileOutputStream fos=new FileOutputStream(f1,true);
			PrintWriter pw = new PrintWriter(fos);
			if(e.getSource()==b1)
			{
				String firstname=t1.getText();
                               
				String age=t2.getText();
                            
				String email=t3.getText();
                               
				String pickup=t4.getText();
				String passenger=t5.getText();
				String lastname=t6.getText();
				String mobileno=t7.getText();
				String drop=t8.getText();
                                String male=rd1.getText();
                                String female=rd2.getText();
                                //String female=rd2.getToolTipText();
                                
                                
				pw.write("First Name:");                             
                                pw.write(firstname);
                                pw.write("\t");
                                 
                                pw.write("Last Name:");   
                                pw.write(lastname);
                                pw.write("\t");
                                 
                               if(e.getSource()==rd1)
                               {
                                pw.write("Gender:");
                                pw.write(male);
                                pw.write("\t");
                                
                               }
                               if (e.getSource()==rd2)
                               {
                                pw.write("Gender:");
                                pw.write(female);
                                pw.write("\t");
                               }
                                /*pw.write("Gender:");
                                pw.write(male);
                                pw.write(female);*/
                                pw.write("Age:");                                 
                                pw.write(age);
                                pw.write("\t");
                                
                                pw.write("Email Add:");                               
                                pw.write(email);
                                pw.write("\t");
                                 
                                pw.write("Mobile Number:");                                  
                                pw.write(mobileno);
                                pw.write("\t");
                                 
                                pw.write("Pickup Location:");                    
                                pw.write(pickup);
                                pw.write("\t");
                                
                                pw.write("Drop Location:");                                
                                pw.write(drop);
                                pw.write("\t");
                                
                                pw.write("NO. of Passengers:");                                
                                pw.write(passenger);
                                pw.write("\t");
                                 
		              //  pw.println("\nFIRST NAME:"+firstname+"\t"+"\nLAST NAME:"+lastname+"\t"+"\AGE:"+age+"\t"+"\EMAIL ADD:"+email+"\t"+"\n PICKUP LOCATION:"+pickup+"\t"+"\nDROP LOCATION:"+drop+"\t"+"\nMOBILE NUMBER:"+mobileno+"\t"+"\nNO OF PASSENGER:"+passenger);
	   			
                                pw.flush();
				pw.close();
								
				t1.setText(" ");
				t2.setText(" ");
				t3.setText(" ");
				t4.setText(" ");
				t5.setText(" ");
				t6.setText(" ");
				t7.setText(" ");
				t8.setText(" ");

			}
	}
	catch(Exception exp)
	{
		System.out.println(exp);
	}
	if(e.getSource() == b2)
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
			t4.setText(" ");
			t5.setText(" ");
			t6.setText(" ");
			t7.setText(" ");
			t8.setText(" ");
		
			rd1.setSelected(false);
			rd2.setSelected(false);
//			bx1.setSelectedIndex(0);
	
		}
		if(e.getSource() == b3)
		{
			System.exit(0);
		}
		
	  
	
}
   
    public static void main(String[] args)
    {
       new CabBooking();
    }
    
}
