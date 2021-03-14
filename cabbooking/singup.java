/*
Name - Ramdev Pandey
Roll no- 18MCMC65
this code is for registration
*/
package cabbooking;

import javax.swing.*;
//import com.mysql.jdbc*;
import java.sql.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class singup implements ActionListener
{
    JFrame f=new JFrame();
    JButton b1,b2;
    JTextArea ta;
    JTextField j1,j2,j3,j4,j5;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
  singup()
  {
     
     f.setSize(400,600);
     f.setLayout(null);
     //panel 1
     JPanel p1 =new JPanel();
     p1.setLayout(null);
      p1.setBackground(new Color(248,148,6));
      p1.setBounds(0,0,400,50);
      //label
      JLabel l = new JLabel("Registration Form");
      l.setBounds(90,10,500,40);
      l.setFont(new Font("Serif",Font.BOLD,24));
     p1.add(l); 
     //panel2
     JPanel p2 = new JPanel();
     p2.setLayout(null);
     p2.setBounds(0,50,400,550);
     p2.setBackground(new Color(44,62,80));
     
     l1=new JLabel("First Name:");
     l1.setBounds(10,70,150,20);
     l1.setFont(new Font("Serif",Font.BOLD,18));
     l1.setForeground(Color.white);
     l2=new JLabel("Last Name:");
     l2.setBounds(10,110,150,20);
     l2.setFont(new Font("Serif",Font.BOLD,18));
     l2.setForeground(Color.white);
     l3=new JLabel("User Name:");
     l3.setBounds(10,150,150,20);
     l3.setFont(new Font("Serif",Font.BOLD,18));
     l3.setForeground(Color.white);
     l4=new JLabel("Password:");
     l4.setBounds(10,190,150,20);
     l4.setFont(new Font("Serif",Font.BOLD,18));
     l4.setForeground(Color.white);
     l5=new JLabel("Re-enter Pass:");
     l5.setBounds(10,230,150,20);
     l5.setFont(new Font("Serif",Font.BOLD,18));
     l5.setForeground(Color.white);
     l6=new JLabel("BirthDate:");
     l6.setBounds(10,270,150,20);
     l6.setFont(new Font("Serif",Font.BOLD,18));
     l6.setForeground(Color.white);
     l7=new JLabel("Gender:");
     l7.setBounds(10,310,150,20);
     l7.setFont(new Font("Serif",Font.BOLD,18));
     l7.setForeground(Color.white);
     l8=new JLabel("Address:");
     l8.setBounds(10,350,150,20);
     l8.setFont(new Font("Serif",Font.BOLD,18));
     l8.setForeground(Color.white);
     
     //textfields
     
     j1=new JTextField();
     j1.setBounds(170,73,170,20);
     j2=new JTextField();
     j2.setBounds(170,115,170,20);
     j3=new JTextField();
     j3.setBounds(170,155,170,20);
     JPasswordField pass1=new JPasswordField();
     pass1.setBounds(170,195,170,20);
     JPasswordField pass2=new JPasswordField();
     pass2.setBounds(170,230,170,20);
     j4=new JTextField();
     j4.setBounds(170,270,170,20);
     j5=new JTextField();
     j5.setBounds(170,310,170,20);
     ta=new JTextArea();
     ta.setBounds(170,350,170,80);
     
     //Buttons
     b1=new JButton("Cancel");
     b1.setBounds(80,450,90,30);
    // b1.addActionListener(new ActionListener()
      //{
        //  public void actionPerformed(ActionEvent e)
          //{
         
            // f.dispose();
          //}
      //});
     b2=new JButton("Register");
     b2.setBounds(190,450,90,30);
         b2.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
             new welcome();
             f.dispose();
          }
      });
     
     
     
     //adding in panel2
     p2.add(b2);
     p2.add(b1);
     p2.add(l1);
     p2.add(j5);
     p2.add(l2);
     p2.add(l3);
     p2.add(l4);
     p2.add(l5);
     p2.add(l6);
     p2.add(l7);
     p2.add(l8);
     p2.add(j1);
     p2.add(j2);
     p2.add(j3);
     p2.add(j4);
     p2.add(pass1);
     p2.add(pass2);
     p2.add(ta);
     //p2.add(L);
     //adding in frame 
      b1.addActionListener(this);
      b2.addActionListener(this);
     
     f.add(p1);
     f.add(p2);
     f.setVisible(true);
     
      
  }
  
  
  public void actionPerformed(ActionEvent e)
	{
		try
		{
			File f1=new File("Registration.txt");
			FileOutputStream fos=new FileOutputStream(f1,true);
			PrintWriter pw = new PrintWriter(fos);
			if(e.getSource()== b2)
			{
				String firstname=j1.getText();
                               
				String lastname=j2.getText();
                            
				String username=j3.getText();
                               
				String dob=j4.getText();
				String gender=j5.getText();
				String addr=ta.getText();
                                //String female=rd2.getToolTipText();
                                
                                
				pw.write("First Name:");                             
                                pw.write(firstname);
                                pw.write("\t");
                                 
                                pw.write("Last Name:");   
                                pw.write(lastname);
                                pw.write("\t");
                                 
                                pw.write("Gender:");
                                pw.write(gender);
                                pw.write("\t");
                                
                                pw.write("User Name:");                               
                                pw.write(username);
                                pw.write("\t");
                                 
                                pw.write("Date Of Birth:");                                  
                                pw.write(dob);
                                pw.write("\t");
                                 
                                pw.write("Address:");                    
                                pw.write(addr);
                                pw.write("\t");
                                
                              
                                 
		              //  pw.println("\nFIRST NAME:"+firstname+"\t"+"\nLAST NAME:"+lastname+"\t"+"\AGE:"+age+"\t"+"\EMAIL ADD:"+email+"\t"+"\n PICKUP LOCATION:"+pickup+"\t"+"\nDROP LOCATION:"+drop+"\t"+"\nMOBILE NUMBER:"+mobileno+"\t"+"\nNO OF PASSENGER:"+passenger);
	   			
                                pw.flush();
				pw.close();
								
				j1.setText(" ");
				j2.setText(" ");
				j3.setText(" ");
				j4.setText(" ");
				j5.setText(" ");
				ta.setText(" ");
				//j7.setText(" ");
				//j8.setText(" ");

			}
	}
	catch(Exception exp)
	{
		System.out.println(exp);
	}
	
		if(e.getSource() == b1)
		{
			System.exit(0);
		}
		
	  
	
 }
   
  public static void main(String args[])
  {
    new singup();
  }
}
