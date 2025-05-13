/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joey
 */
public class Main {
    public static void main(String[] args) {
        // Sample Employee
        Employee emp1 = new Employee(123, "Juan Dela Cruz", "IT");
        System.out.println(emp1);

        // Attendance
        Attendance att1 = new Attendance(123, "2025-05-12", true);
        System.out.println(att1);

        // Payroll
        Payroll payroll1 = new Payroll(123, 30000, 2000, 1500);
        System.out.println(payroll1);

        // Leave
        Leave leave1 = new Leave(123, "Vacation", "2025-05-20", "2025-05-25", true);
        System.out.println(leave1);

        // Reimbursement
        Reimbursement reimburse1 = new Reimbursement(123, "Travel", 1200, false);
        System.out.println(reimburse1);

        // Loan and Benefits
        LoanAndBenefits loan1 = new LoanAndBenefits("BEN001", "Personal Loan", 50000, 0.05f);
        loan1.applyForLoan();
        System.out.println("Monthly Deduction: Php" + loan1.calculateLoanDeduction());

        // Performance Review
        PerformanceReview review1 = new PerformanceReview("REV001", "2025-05-10", "Manager A", 85, "Good performance.");
        review1.recordReview();
        // review1.updateReview("Updated remarks here"); // Uncomment if update is needed
    }
}