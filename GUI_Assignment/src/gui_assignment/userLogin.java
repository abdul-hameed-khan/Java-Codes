package gui_assignment;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author EdRis ShaRifi
 */
public class userLogin extends JFrame {
    
    JButton butt2;
    JButton butt1;
    JPasswordField text2;
    JTextField text1;
    String un="Ali";
    String Password="12345";
    String l ="USER LOGIN";
    public userLogin(){
        super("User Login");
        setLayout(null);
        JLabel user = new JLabel("Enter User Name=>");
        user.setToolTipText("username");
        user.setBounds(20,20, 140, 20);
        this.add(user);
        JLabel pass = new JLabel("Enter your Password=>");
        pass.setToolTipText("password");
        pass.setBounds(20,60, 150, 20);
        this.add(pass);
         text1  = new JTextField(20);
        text1.setToolTipText("username");
        text1.setBounds(170,20, 140, 20);
        add(text1);
        text2  = new JPasswordField(20);
        text2.setToolTipText("userpassword");
        text2.setBounds(170,60, 140, 20);
        add(text2);
         butt1  = new JButton("Cancel");
        butt1.setBounds(80,100, 80, 20);
        add(butt1);
         butt2  = new JButton("OK");
        butt2.setBounds(230,100, 80, 20);
        add(butt2);
        getContentPane().setBackground(Color.yellow);
        eventhandling object = new eventhandling();
        butt2.addActionListener(object);
    }//end of constractor
    
    private class eventhandling implements ActionListener {
    
        @Override
        public void actionPerformed(ActionEvent e){
          
          if(un.equals(text1.getText()) &&  Password.equals(text2.getText() ) ){  
              // userLogin fram1  = new userLogin();
          // fram1.setVisible(false);
           JLABEL Fram = new JLABEL();
           Fram.setTitle("BMI");
           Fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           Fram.setSize(550,600);
           Fram.setVisible(true);
          
           }else {
            JOptionPane.showMessageDialog(null,"WARNING\nTHE USERNAME AND PASSWORD IS WRONG\nPLEAS PUT CORRECT PASSWORD AND USERNAME", l, 2);
           }
        }//end of actionPerformed Methode
    }//end of Private class
    
}//end of Class User login
