/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joey
 */
public class Reimbursement {
    private final int employeeId;
    private final String purpose;
    private final double amount;
    private final boolean approved;

    public Reimbursement(int employeeId, String purpose, double amount, boolean approved) {
        this.employeeId = employeeId;
        this.purpose = purpose;
        this.amount = amount;
        this.approved = approved;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId +
               ", Purpose: " + purpose +
               ", Amount: Php" + amount +
               ", Approved: " + approved;
    }
}
