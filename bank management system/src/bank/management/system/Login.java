

package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public  class Login extends JFrame implements ActionListener{
    JButton login, signup, clear;
    JTextField cardTextField;
    // to hide the password we use JPasswordField
    JPasswordField pinTextField;
    
    
    
    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        // we create logo by this
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm-machine.png"));
        Image i2 = i1.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel label = new JLabel(i3);
        label.setBounds(150, 35, 55, 55);
        add(label);
        
        // size of the box
        
        setSize(800, 450);
        setVisible(true);
        setLocation(350, 200);
        
        
        // to write the text we use jLabel
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD,36));
        text.setBounds(250, 40, 400, 40);
        add(text);
        
        JLabel card = new JLabel("Card No.");
        card.setFont(new Font("Raleway", Font.BOLD,24));
        card.setBounds(150, 150, 150, 30);
        add(card);
        
        
        // we write this to create text field in front of card number
        // we firstly write JTextField but to define it globley we remove Jtextfield
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(cardTextField);
        
        // we create a heading pin and create text field for it
        
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD,24));
        pin.setBounds(150, 220, 250, 30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(pinTextField);
        
        // To create button in the bottom of this page
        // we firstly write as JButton login = new JButton("SIGN IN")
        // but we then remove JButton to define globely
        
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 270, 100,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        //TO create  another button 
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 320, 230,30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
        // create signup button
        clear = new JButton("CLEAR");
        clear.setBounds(430, 270, 100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        
        
        getContentPane().setBackground(Color.white);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
            
            
        }else if(ae.getSource() == login) {
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
               ResultSet rs = conn.s.executeQuery(query);
               if (rs.next()){
                   setVisible(false);
                   new Transactions(pinnumber).setVisible(true);
               }else{
                   JOptionPane.showMessageDialog(null, "Incorret Card Number or Pin");
               }
              
                
            } catch (Exception e){
                System.out.println(e);
            }
            
            
            
        }else if(ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
           
  
            
        }
        
        
    }
    
    public static void main(String args[]) {
        new Login();
           
        }
}
            
        
    
    

    
