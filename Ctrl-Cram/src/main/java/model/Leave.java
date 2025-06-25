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
import java.time.*;

public class Leave {
    
    private final String employeeId;
    private String leaveType;  // e.g., "Sick", "Vacation"
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean ifApproved;
    
    public Leave(String employeeId, String leaveType, LocalDate startDate, LocalDate endDate, boolean approved) {
        this.employeeId = employeeId;
        this.leaveType = leaveType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.ifApproved = ifApproved;
    }
        public String toString() {
        return "Employee ID: " + employeeId +
               ", Leave Type: " + leaveType +
               ", From: " + startDate + " to " + endDate +
               ", Status: " + ifApproved;
        }
        
        public String getEmployeeId() {
        return employeeId;
        }
        
        public String getLeaveType(){
          return leaveType;
        }
        public LocalDate getStartDate(){
            return startDate;
        }
        
        public LocalDate getEndDate(){
            return endDate;
        }
        public boolean getifApproved(){
        return ifApproved;
    }
    
}


