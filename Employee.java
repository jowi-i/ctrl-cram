/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author miiny
 */
import java.util.Date;
public class Employee {
   
    private String employeeID;
    private String name;
    private String position;
    private String birthday;
    private String address;
    private String phone;
    private String status;
    private String supervisor;
    private String sssNumber;
    private String tinNumber;
    private String pagIbigNumber;
    private String philHealthNumber;
    private final Date hireDate;
    
    public Employee(String employeeID, String name, String position, String birthday, String address, 
            String phone, String status, String supervisor, String sssNumber, String tinNumber, String pagIbigNumber, String philHealthNumber,
            Date hireDate){
    
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.status = status;
        this.supervisor = supervisor;
        this.hireDate = hireDate;
        this.sssNumber = sssNumber;
        this.tinNumber = tinNumber;
        this.pagIbigNumber = pagIbigNumber;
        this.philHealthNumber = philHealthNumber;}
    
    public String getEmployeeByID() { return employeeID; }
    public void setEmployeeByID(String employeeID) {this.employeeID = employeeID;}
    
    public String getName() { return name; }
    public void setName(String name) {this.name = name;}
     
    public String getPosition() { return position; }
    public void setPosition(String position) {this.position = position;}
    
    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) {this.birthday = birthday;}
    
    public String getAddress() { return address; }
    public void setAddress(String address) {this.address = address;}
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) {this.phone = phone;}
    
    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    
    public String getSupervisor() {return supervisor;}
    public void setSupervisor(String supervisor) { this.supervisor = supervisor; }
    
    public String getSssNumber() {return sssNumber;}
    public void setSssNumber(String sssNumber) { this.sssNumber = sssNumber; }
    
    public String getTinNumber() {return tinNumber;}
    public void setTinNumber(String tinNumber) { this.tinNumber = tinNumber; }
    
    public String getPagIbigNumber() {return pagIbigNumber;}
    public void setPagIbigNumber(String pagIbigNumber) { this.pagIbigNumber = pagIbigNumber; }
    
    public String getPhilHealthNumber() {return philHealthNumber;}
    public void setPhilHealthNumber(String philHealthNumber) { this.philHealthNumber = philHealthNumber; }
    
    public Date getHireDate() {return hireDate;}
    
     public void applyForLeave() {
        System.out.println(name + " is applying for leave...");
    }

    public void requestReimbursement() {
        System.out.println(name + " is requesting reimbursement...");
    }

    public void viewPayslip() {
        System.out.println(name + " is viewing payslip...");
    }
}
    