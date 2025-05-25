/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 *
 * @author joey
 */
public class LoanAndBenefits {
    
    private final String benefitID;
    private final String loanType;
    private final float loanAmount;
    private final float interestRate;
    private final float monthlyDeduction;
    
    public LoanAndBenefits(String benefitID, String loanType, float loanAmount, float interestRate) {
        this.benefitID = benefitID;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.monthlyDeduction = calculateLoanDeduction();
    }

    public void applyForLoan() {
        System.out.println("Loan applied for: " + loanType);
    }

    public float calculateLoanDeduction() {
        return (loanAmount * (1 + interestRate)) / 12;
    }
}
    

