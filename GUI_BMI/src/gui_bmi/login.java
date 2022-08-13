
package gui_bmi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class login extends JFrame{
    
    public login(){
    super("login");
        setLayout(null);
        JLabel un = new JLabel("login");
        un.setToolTipText("labal1");
        un.setBounds(200, 20, 150, 50);
        add(un);
         JLabel p  = new JLabel("Enter name ");
        p.setToolTipText("labal2");
        p.setBounds(45, 60, 200, 50);
        add(p);
         JLabel ps  = new JLabel("Enter password ");
        ps.setToolTipText("labal3");
        ps.setBounds(45, 100, 200, 50);
        add(ps);
        JTextField text1 = new JTextField(20);
        text1.setToolTipText("label 1");
        text1.setBounds(200,77,200 ,30);
        add(text1);
         JTextField text2 = new JTextField(20);
         text2.setToolTipText("label 2");
        text2.setBounds(200,115,200 ,30);
        add(text2);
        JButton OK = new JButton("OK");
        OK.setBounds(200, 155, 80, 30);
        add(OK);
        JButton Cancel = new JButton("Cancel");
        Cancel.setBounds(300, 155, 80, 30);
        add(Cancel);
        eventhandling eh= new eventhandling();
        OK.addActionListener(eh);
}
    private class eventhandling implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            JLABEL mff= new JLABEL();
            mff.setTitle("BMI");
            mff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mff.setSize(500,500);
            mff.setVisible(true);
        }
    }
    
}
