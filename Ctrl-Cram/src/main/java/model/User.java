/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author miiny
 */
public class User {
    
    
    private final String employeeId;
    public final String password;
    public final String position;

    public User(String employeeId, String password, String position) {
        this.employeeId = employeeId;
        this.password = password;
        this.position = position;
    }

    public String getEmployeeId() { 
        return employeeId; 
    }
    public String getPassword() { 
        return password; 
    }
    public String getPosition() { 
        return position; 
    }
}
   

