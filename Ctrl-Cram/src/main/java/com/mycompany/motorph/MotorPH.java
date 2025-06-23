/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorph;

import javax.swing.SwingUtilities;
import motorph.Login;


/**
 *
 * @author miiny
 */
public class MotorPH {

    public static void main(String[] args) {     
       SwingUtilities.invokeLater(() -> {
           Login login = new Login(); // your login window class
            login.setVisible(true);
        });
        /*JFrame frame = new JFrame("Employee Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setContentPane(new EmployeePanel());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);*/
    
        
}
}



