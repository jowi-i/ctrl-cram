/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joey
 */
public class Leave {
    private int employeeId;
    private String leaveType;  // e.g., "Sick", "Vacation"
    private String startDate;
    private String endDate;
    private boolean approved;

    public Leave(int employeeId, String leaveType, String startDate, String endDate, boolean approved) {
        this.employeeId = employeeId;
        this.leaveType = leaveType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.approved = approved;
    }

    public String toString() {
        return "Employee ID: " + employeeId +
               ", Leave Type: " + leaveType +
               ", From: " + startDate + " to " + endDate +
               ", Approved: " + approved;
    }
}
