/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joey
 */
public class Payroll { 
    
     private final String employeeId;
    private final double basicSalary;
    private final double bonus;
    private final double deductions;

    public Payroll(String employeeId, double basicSalary, double bonus, double deductions) {
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    public double calculateNetSalary() {
        return basicSalary + bonus - deductions;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId +
               ", Net Salary: Php" + String.format("%.2f", calculateNetSalary());
    }
}
    

