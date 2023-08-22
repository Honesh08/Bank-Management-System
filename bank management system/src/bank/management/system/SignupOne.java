
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

/*interface ActionListner{
    
}*/


public class SignupOne extends JFrame  implements ActionListener {
    // new updates
    
    long random;
    JTextField nameTextField,fnameTextField,dobTextField, pincodeTextField,emailTextField,addressTextField,cityTextField,stateTextField;
    JButton next;
    JDateChooser dateChooser;
    JRadioButton male,female,Other,Married,Unmarried;
    
    
    SignupOne(){
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000l) + 1000L);
        
        // now we create all the JLabels 
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random );
        formno.setFont(new Font("Raleway", Font.BOLD,34));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        //
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD,22));
        personDetails.setBounds(290,80,600,40);
        add(personDetails);
        
        // NOW we make labels for all details
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,350,30);
        add(nameTextField);
        
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,350,30);
        add(fnameTextField);
        
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,350,30);
        add(dob);
        
        
        // To add calender in the dob label we use JDateChooser
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,350,30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
        

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        // WE make radio button for gender label
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        // TO remove the error of selecting both we make another class
        ButtonGroup gendergroup =  new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        JLabel email = new JLabel("E-mail:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,350,30);
        add(emailTextField);
        
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        
        Married  = new JRadioButton("Married");
        Married.setBounds(300,390,100,30);
        Married.setBackground(Color.WHITE);
        add(Married);
        
        
        Unmarried = new JRadioButton("Unmarried");
        Unmarried.setBounds(450,390,120,30);
        Unmarried.setBackground(Color.WHITE);
        add(Unmarried);
        
        
        Other = new JRadioButton("Other");
        Other.setBounds(600,390,120,30);
        Other.setBackground(Color.WHITE);
        
        
        add(Other);
        
        // TO remove the error of selecting both we make another class
        
        ButtonGroup maritalgroup =  new ButtonGroup();
        maritalgroup.add(Married);
        maritalgroup.add(Unmarried);
        maritalgroup.add(Other);
        
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,350,30);
        add(addressTextField);
        
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,350,30);
        add(cityTextField);
        
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,350,30);
        add(stateTextField);
        
        
        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,350,30);
        add(pincodeTextField);
        
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,16));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
         setSize(850,800);
          setLocation(350,10);
          setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
            
        }else if(female.isSelected()){
            gender = "Female";
            
        }
        String email = emailTextField.getText();
        String marital = null;
        if(Married.isSelected()){
            marital = "Married";
            
            
        }else if(Unmarried.isSelected()){
            marital = "Unmarried";
            
        }else if(Other.isSelected()){
            marital= "other";
            
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            } else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"','"+fname+"', '"+dob+"', '"+gender+"', '"+email+"','"+marital+"','"+address+"', '"+city+"','"+pincode+"','"+state+"')";
                
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
            
            
        }catch (Exception e) {
            System.out.println(e);
            
        }
        
    }

    
    public static void main(String args[]) {
        new SignupOne();
        // TODO code application logic here
    }
}

