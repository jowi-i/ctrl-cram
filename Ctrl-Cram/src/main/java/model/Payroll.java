/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joey
 * @author miiny
 */
public class Payroll { 
    
    private final String employeeId;
    private final double basicSalary;
    private final double hourlyRate;

    public Payroll(String employeeId, double basicSalary, double hourlyRate) {
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.hourlyRate = hourlyRate;
    }
    public String getEmployeeId() { 
        return employeeId; 
    }
    public double getBasicSalary() {
        return basicSalary; 
    }
    public double getHourlyRate() {
        return hourlyRate; 
    }
    public double calculateGrossPay(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }
     public double calculateDeductions(double grossPay) {
        double sss = grossPay * 0.15;
        double philHealth = grossPay * 0.05;
        double pagIbig = grossPay * 0.02;
        return sss + philHealth + pagIbig;
    }

    public double calculateNetPay(int hoursWorked) {
        double gross = calculateGrossPay(hoursWorked);
        return gross - calculateDeductions(gross);
    }
}
