/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorph;

import GUI.*;
import javax.swing.JFrame;

/**
 *
 * @author miiny
 */
public class MotorPH {

    public static void main(String[] args) {     
       JFrame frame = new JFrame("Employee Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setContentPane(new EmployeePanel());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
}
}



