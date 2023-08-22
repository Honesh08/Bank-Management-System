
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/*interface ActionListner{
    
}*/


public class SignupTwo extends JFrame  implements ActionListener {
    // new updates
    
    long random;
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion, category, occu, education, income;
    String formno;
    
    
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        
        /*random = Math.abs((ran.nextLong() % 9000l) + 1000L);*/
        
        // now we create all the JLabels 
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        //
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additionalDetails.setBounds(290,50,600,40);
        add(additionalDetails);
        
        // NOW we make labels for all details
        
        JLabel sreligion = new JLabel("Religion:");
        sreligion.setFont(new Font("Raleway",Font.BOLD,20));
        sreligion.setBounds(100,140,100,30);
        add(sreligion);
        
        // we use JComboBox to make slide bar
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,350,30);
        religion.setBackground(Color.WHITE);
        add(religion);
       
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valcategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,350,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,350,30);
        add(dob);
        
        // JComboBox is used to make slider
        
        String incomecategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,240,350,30);
        income.setBackground(Color.WHITE);
        add(income);
        
    
        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway",Font.BOLD,20));
        educational.setBounds(100,290,200,30);
        add(educational);
                   
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,320,200,30);
        add(qualification);
        
        String educationValues[] ={"Non-Graduation","Graduate","Post-Graduation","Doctrate","Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315,350,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,370,200,30);
        add(occupation);
        
        String occupationValues[] ={"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
        occu = new JComboBox(occupationValues);
        occu.setBounds(300,370,350,30);
        occu.setBackground(Color.WHITE);
        add(occu);
        
       
        // TO remove the error of selecting both we make another class
       
        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,420,200,30);
        add(pan);
        
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,420,350,30);
        add(panTextField);
        
        
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,470,200,30);
        add(aadhar);
        
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,470,350,30);
        add(aadharTextField);
        
        
        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorcitizen.setBounds(100,520,200,30);
        add(seniorcitizen);
        
        // WE have to make radio button here
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,520,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,520,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorc = new ButtonGroup();
        seniorc.add(syes);
        seniorc.add(sno);
        
       
        
        JLabel account = new JLabel("Exisiting Account:");
        account.setFont(new Font("Raleway",Font.BOLD,20));
        account.setBounds(100,570,200,30);
        add(account);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,570,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,570,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup accounti = new ButtonGroup();
        accounti.add(eyes);
        accounti.add(eno);
        
      
        
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
        String areligion = (String)religion.getSelectedItem();
        String fname = (String)category.getSelectedItem();
        String dob = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occu.getSelectedItem();
        String aseniorcitizen = null;
        
        if(syes.isSelected()){
            aseniorcitizen = "Yes";
            
        }else if(sno.isSelected()){
            aseniorcitizen = "No";
            
        }
        
        String account = null;
        
        if(eyes.isSelected()){
            account = "Yes";
            
            
        }else if(eno.isSelected()){
            account = "No";
            
            
        }
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();

        try{
            

                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+areligion+"','"+fname+"', '"+dob+"','"+seducation+"','"+soccupation+"','"+span+"', '"+saadhar+"','"+account+"','"+aseniorcitizen+"')";
                
                c.s.executeUpdate(query);
                
                //Signup3 object
            
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }catch (Exception e) {
            System.out.println(e);
            
        }
        
    }

    
    public static void main(String args[]) {
        new SignupTwo("");
        // TODO code application logic here
    }
}

