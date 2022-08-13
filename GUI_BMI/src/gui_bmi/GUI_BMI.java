/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_bmi;
import javax.swing.JFrame;
/**
 *
 * @author Zulfiqar
 */
public class GUI_BMI {

    public static void main(String[] args) {
       JLABEL Fram = new JLABEL();
    Fram.setTitle("BMI CALCULATION");
    Fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Fram.setSize(550,500);
    Fram.setVisible(true);
    login Frame= new login();
    Frame.setTitle("login");
    Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Frame.setSize(550,500);
    Frame.setVisible(true);
    }//end of main
}
    

