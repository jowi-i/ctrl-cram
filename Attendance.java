/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joey
 */
public class Attendance {
    private int employeeId;
    private String date;
    private boolean present;

    public Attendance(int employeeId, String date, boolean present) {
        this.employeeId = employeeId;
        this.date = date;
        this.present = present;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDate() {
        return date;
    }

    public boolean isPresent() {
        return present;
    }

    public String toString() {
        return "Employee ID: " + employeeId + ", Date: " + date + ", Present: " + present;
    }
}
