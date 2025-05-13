/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Joey
 */
public class PerformanceReview {
    private final String reviewID;
    private final String reviewDate;
    private final String reviewerName;
    private final int performanceScore;
    private String remarks;

    public PerformanceReview(String reviewID, String reviewDate, String reviewerName, int performanceScore, String remarks) {
        this.reviewID = reviewID;
        this.reviewDate = reviewDate;
        this.reviewerName = reviewerName;
        this.performanceScore = performanceScore;
        this.remarks = remarks;
    }

    public void recordReview() {
        System.out.println("Review recorded by " + reviewerName);
    }

    public void updateReview(String newRemarks) {
        this.remarks = newRemarks;
        System.out.println("Review updated.");
    }
}
