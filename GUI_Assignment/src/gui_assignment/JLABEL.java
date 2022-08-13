package gui_assignment;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
/*
 *
 * @author EdRis ShaRifi
 */
public class JLABEL extends JFrame {
        
    JLabel label;JTextField text1;JTextField text2;JTextField text3;JComboBox box1;JComboBox box2;
    JTextArea text_area;JButton butt;
    String Mass = "Warning";String name = null;
    String wi = null;String a1 = "your underwight";
    String hi = null;String state = "KG";String show=null;String select1=null;String select2 = null;
    String []Jmassgebox1 = {"KG","Pounds"}; String []Jmassgebox2 = {"CM","feet","Inch"};
    
    public JLABEL(){
        
        super("BMI CALCULATOR");
        setLayout(null);
        JLabel lebal_A = new JLabel("BMI CALCULATOR");
        lebal_A.setToolTipText("labal1");
        lebal_A.setBounds(200, 20, 150, 50);
        add(lebal_A);
        JLabel lebal_B  = new JLabel("Enter your name =>");
        lebal_B.setToolTipText("labal2");
        lebal_B.setBounds(45, 60, 200, 50);
        add(lebal_B);
        JLabel lebal_C  = new JLabel("Enter your weight =>");
        lebal_C.setToolTipText("labal3");
        lebal_C.setBounds(45, 100, 200, 50);
        add(lebal_C);
        JLabel lebal_D  = new JLabel("Enter your height =>");
        lebal_D.setToolTipText("labal4");
        lebal_D.setBounds(45, 140, 200, 50);
        add(lebal_D);
        JLabel lebal_E = new JLabel("Enter Unit");
        lebal_E.setToolTipText("labal5");
        lebal_E.setBounds(400, 70, 150, 50);
        add(lebal_E);//end of All lebals
        /////////////////////
        
        text1 = new JTextField(20);
        text1.setToolTipText("weight");
        text1.setBounds(200,77,70 ,20);
        add(text1);
        text2 = new JTextField(20);
        text2.setToolTipText("hieght");
        text2.setBounds(200,115,70 ,20);
        add(text2);
        text3 = new JTextField(20);//
        text3.setBounds(200,150,70 ,20);
        add(text3);
        box1 = new JComboBox(Jmassgebox1);
        box1.setMaximumRowCount(2);
        box1.addItemListener(
                             new ItemListener(){
                                     @Override
                                     public void itemStateChanged(ItemEvent event){
                                            if(event.getStateChange() == ItemEvent.SELECTED ){
                                               box1.getSelectedIndex();
                                                    }
                                                  }//end of methode 
                                                 }//end of class
                                                );//end of addItemListener
        box1.setBounds(400, 115, 80, 20);
        add(box1);
        box2 = new JComboBox(Jmassgebox2);
        box2.setMaximumRowCount(3);
        box2.addItemListener(
                             new ItemListener(){
                                     @Override
                                     public void itemStateChanged(ItemEvent event){
                                            if(event.getStateChange() == ItemEvent.SELECTED ){
                                               box2.getSelectedItem();
                                                    }
                                                  }//end of methode 
                                                 }//end of class
                                                );//end of addItemListener
        box2.setBounds(400,147, 80, 20);       
        add(box2);
        
        text_area  = new JTextArea();
        text_area.setBounds(70, 240, 400, 200);
        add(text_area);
        butt  = new JButton();
        butt.setText("CALCULATE");
        butt.setBounds(220, 200, 120, 20);
        add(butt);
        getContentPane().setBackground(Color.pink);
        eventhandling  obj = new eventhandling ();
        butt.addActionListener(obj);
        
        
    }//end of constractor
    
    private class eventhandling  implements ActionListener {
       
    
        public void actionPerformed(ActionEvent e){
            
            int wi1 , hi2 ;
            double Wi=0.0, Hi = 0.0,Hi2=0.0,Bmi=0.0,Wi2=0.0;
            name = text1.getText();
            wi = text2.getText();
            hi = text3.getText();
            wi1 =  Integer.parseInt(wi);
            hi2 = Integer.parseInt(hi);
           // state = box1.getName();
            Wi = (int )wi1;
            Hi = (int)hi2;
            
            if(box1.getSelectedIndex()==0 && box2.getSelectedIndex()== 0){ //KILOGRAM AND CANTIMETER
                Hi2 = (Hi/100);//convert CM to Meter
                Bmi = (Wi/(Hi2*Hi2));//calculatng BMI
             
                if(Bmi < 18.5){
                        text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" CM\n"
                            + "Your weight "+wi+" KG\nYour Underweight as calculation of BMI Standard\nPlease take care and have good diet\n"
                            + "THANKS FOR USING THIS APPLICATION");
               }else if(Bmi>18.5 && Bmi < 24.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" CM\n"
                           + "Your weight "+wi+" KG\nYour Normal as calculation of BMI Standard\nPlease take care and have good diet\n"
                           + "THANKS FOR USING THIS APPLICATION");
                }else if(Bmi > 24.5 && Bmi < 29.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" CM\n"
                        + "Your weight "+wi+" KG\nYour Over Wieght as calculation of BMI Standard\nPlease take care and Do some Excersie\n"
                        + "THANKS FOR USING THIS APPLICATION");
                }else if(Bmi > 29.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" CM\n"
                        + "Your weight "+wi+" KG\nYour Obese as calculation of BMI Standard\nPlease take care and Do some Excersie\n"
                        + "THANKS FOR USING THIS APPLICATION"); 
                }else {
                    JOptionPane.showMessageDialog(null,"WARNING\nYour input is Wrong \nPlease Try agin",Mass , 2);
                      }
         }else if(box1.getSelectedIndex() == 1 && box2.getSelectedIndex()== 1 ){//POUNDS AND FEET
                Wi2 = (Wi*453.50)/1000;//change of pound in KG
                Hi2 = (Hi*30.48 )/ 100;//change of feet in CM
                Bmi = (Wi2/(Hi2*Hi2));//Bmi calculation  
                 if(Bmi < 18.5){
                        text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" feet\n"
                            + "Your weight "+wi+" Pounds\nYour Underweight as calculation of BMI Standard\nPlease take care and have good diet\n"
                            + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi>18.5 && Bmi < 24.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" feet\n"
                           + "Your weight "+wi+" Pounds\nYour Normal as calculation of BMI Standard\nPlease take care and have good diet\n"
                           + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi > 24.5 && Bmi < 29.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" feet\n"
                        + "Your weight "+wi+" Pounds\nYour Over Wieght as calculation of BMI Standard\nPlease take care and Do some Excersie\n"
                        + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi > 29.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" feet\n"
                        + "Your weight "+wi+" Pounds\nYour Obese as calculation of BMI Standard\nPlease take care and Do some Excersie\n"
                        + "THANKS FOR USING THIS APPLICATION"); 
                 }else {
                    JOptionPane.showMessageDialog(null,"WARNING\nYour input is Wrong \nPlease Try agin",Mass , 2);
                      }
            }else if(box1.getSelectedIndex() == 0 && box2.getSelectedIndex()== 2 ){//KILOGRAM AND INCHES
                Wi2 = Wi ;//Assign the Value in KG 
                Hi2 = (Hi*2.54)/100;//convert the Inch into meter 
                Bmi = (Wi2/(Hi2*Hi2));//Bmi calculation  
                 if(Bmi < 18.5){
                        text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" Inchs\n"
                            + "Your weight "+wi+" KG\nYour Underweight as calculation of BMI Standard\nPlease take care and have good diet\n"
                            + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi>18.5 && Bmi < 24.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" Inchs\n"
                           + "Your weight "+wi+" KG\nYour Normal as calculation of BMI Standard\nPlease take care and have good diet\n"
                           + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi > 24.5 && Bmi < 29.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" Inchs\n"
                        + "Your weight "+wi+" KG\nYour Over Wieght as calculation of BMI Standard\nPlease take care and Do some Excersie\n"
                        + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi > 29.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" Inchs\n"
                        + "Your weight "+wi+" KG\nYour Obese as calculation of BMI Standard\nPlease take care and Do some Excersie\n"
                        + "THANKS FOR USING THIS APPLICATION"); 
                 }else {
                    JOptionPane.showMessageDialog(null,"WARNING\nYour input is Wrong \nPlease Try agin",Mass , 2);
                      }
                
            }else if(box1.getSelectedIndex() == 0 && box2.getSelectedIndex()== 1 ){//KILOGRAM AND FEET
                Wi2 = Wi;//Assign value 
                Hi2 = (Hi*30.48 )/ 100;//convert of feet to CM
                Bmi = (Wi2/(Hi2*Hi2));//Bmi calculation  
                 if(Bmi < 18.5){
                        text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" feet\n"
                            + "Your weight "+wi+" KG\nYour Underweight as calculation of BMI Standard\nPlease take care and have good diet\n"
                            + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi>18.5 && Bmi < 24.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" feet\n"
                           + "Your weight "+wi+" KG\nYour Normal as calculation of BMI Standard\nPlease take care and have good diet\n"
                           + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi > 24.5 && Bmi < 29.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" feet\n"
                        + "Your weight "+wi+" KG\nYour Over Wieght as calculation of BMI Standard\nPlease take care and Do some Excersie\n"
                        + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi > 29.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" feet\n"
                        + "Your weight "+wi+" KG\nYour Obese as calculation of BMI Standard\nPlease take care and Do some Excersie\n"
                        + "THANKS FOR USING THIS APPLICATION"); 
                 }else {
                    JOptionPane.showMessageDialog(null,"WARNING\nYour input is Wrong \nPlease Try agin",Mass , 2);
                      }
            }else if(box1.getSelectedIndex() == 1 && box2.getSelectedIndex()== 0 ){//POUNDS AND CM
                Wi2 = (Wi*453.50)/1000;//Converting pound in KG              
                Hi2 = (Hi/100);//converting cantimeter in meter
                Bmi = (Wi2/(Hi2*Hi2));//Bmi calculation  
                 if(Bmi < 18.5){
                        text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" Cantimeter\n"
                            + "Your weight "+wi+" Pounds\nYour Underweight as calculation of BMI Standard\nPlease take care and have good diet\n"
                            + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi>18.5 && Bmi < 24.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" Cantimeter\n"
                           + "Your weight "+wi+" Pounds\nYour Normal as calculation of BMI Standard\nPlease take care and have good diet\n"
                           + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi > 24.5 && Bmi < 29.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" Cantimeter\n"
                        + "Your weight "+wi+" Pounds\nYour Over Wieght as calculation of BMI Standard\nPlease take care and Do some Excersie\n"
                        + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi > 29.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" Cantimeter\n"
                        + "Your weight "+wi+" Pounds\nYour Obese as calculation of BMI Standard\nPlease take care and Do some Excersie\n"
                        + "THANKS FOR USING THIS APPLICATION"); 
                 }else {
                    JOptionPane.showMessageDialog(null,"WARNING\nYour input is Wrong \nPlease Try agin",Mass , 2);
                      }
            
            }else if(box1.getSelectedIndex() == 1 && box2.getSelectedIndex()== 2 ){//POUNDS AND INCHES
                Wi2 = (Wi*453.50)/1000;//Converting pound in KG 
                Hi2 = (Hi*2.54)/100;//convert the Inch into meter
                Bmi = (Wi2/(Hi2*Hi2));//Bmi calculation  
                 if(Bmi < 18.5){
                        text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" Inche\n"
                            + "Your weight "+wi+" Pounds\nYour Underweight as calculation of BMI Standard\nPlease take care and have good diet\n"
                            + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi>18.5 && Bmi < 24.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" Inche\n"
                           + "Your weight "+wi+" Pounds\nYour Normal as calculation of BMI Standard\nPlease take care and have good diet\n"
                           + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi > 24.5 && Bmi < 29.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" Inches\n"
                        + "Your weight "+wi+" Pounds\nYour Over Wieght as calculation of BMI Standard\nPlease take care and Do some Excersie\n"
                        + "THANKS FOR USING THIS APPLICATION");
                 }else if(Bmi > 29.9){
                     text_area.setText("Dear user\n"+"Your BMI Range "+Bmi+"\nYour name "+name+"\nYour hieght "+hi+" inche\n"
                        + "Your weight "+wi+" Pounds\nYour Obese as calculation of BMI Standard\nPlease take care and Do some Excersie\n"
                        + "THANKS FOR USING THIS APPLICATION"); 
                 }else {
                    JOptionPane.showMessageDialog(null,"WARNING\nYour input is Wrong \nPlease Try agin",Mass , 2);
                      }
            
            }else{
                JOptionPane.showMessageDialog(null,"WARNING\nYour input is Wrong \nPlease Try agin",Mass , 2);
            }

    }//end of actionPerformed Methode
    
    }//end of private class
}//end of JFrame

