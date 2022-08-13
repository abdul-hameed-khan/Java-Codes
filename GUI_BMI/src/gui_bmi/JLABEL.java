
package gui_bmi;
import javax.swing.*;
/*
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
*/
public class JLABEL extends JFrame {
           
    public JLABEL(){
        super("BMI CALCULATION");
        setLayout(null);
        JLabel A = new JLabel("BMI CALCULATION");
        A.setToolTipText("labal1");
        A.setBounds(200, 20, 150, 50);
        add(A);
        JLabel B  = new JLabel("Enter your name ");
        B.setToolTipText("labal2");
        B.setBounds(45, 60, 200, 50);
        add(B);
        JLabel C  = new JLabel("Enter your weight ");
        C.setToolTipText("labal3");
        C.setBounds(45, 100, 200, 50);
        add(C);
        JLabel D  = new JLabel("Enter your height ");
        D.setToolTipText("labal4");
        D.setBounds(45, 140, 200, 50);
        add(D);
        JLabel E = new JLabel("Enter Unit");
        E.setToolTipText("labal5");
        E.setBounds(400, 70, 150, 50);
        add(E);
        
        JTextField text1 = new JTextField(20);
        text1.setToolTipText("weight");
        text1.setBounds(200,77,70 ,20);
        add(text1);
         JTextField text2 = new JTextField(20);
         text2.setToolTipText("hieght");
        text2.setBounds(200,115,70 ,20);
        add(text2);
        JTextField text3 = new JTextField(20);
        text3.setBounds(200,150,70 ,20);
        add(text3);
        JComboBox box1 = new JComboBox();
        box1.setMaximumRowCount(2);
        box1.addItem("kg");
        box1.addItem("Ib");
       box1.setBounds(400, 115, 70, 20);
        add(box1);
        JComboBox box2 = new JComboBox();
        box2.addItem("cm");
        box2.addItem("inch");
        box2.addItem("meter");
        box2.addItem("feet");
       box2.setMaximumRowCount(4);
        box2.setBounds(400,147, 70, 20);
       
        add(box2);
        JTextArea area  = new JTextArea();
        area.setBounds(70, 240, 400, 200);
        add(area);
        JButton butt  = new JButton();
        butt.setText("CALCULATE");
        butt.setBounds(220, 200, 120, 20);
        add(butt);
    }
   
}//end of class


    
