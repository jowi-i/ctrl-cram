/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author miiny
 */
import javax.swing.JFrame;
public class main {
    public static void main(String[] args) {
        
        //dito niyo irun yung file Para gumana yung buong GUI :))
        //MAIN - 
        JFrame frame = new JFrame("Employee Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setContentPane(new EmployeePanel());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

