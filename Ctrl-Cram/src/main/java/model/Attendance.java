/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author miiny
 * @author joey
 */

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Attendance {
    private String employeeId;
    private LocalDate date;
    private LocalTime timeIn;
    private LocalTime timeOut;
    private String status;
    private boolean isPresent;
    private boolean isAbsent;

    private Duration duration;
    private long hours;
    private long minutes;
    private String total;

    public Attendance(String employeeId, LocalDate date, LocalTime timeIn, LocalTime timeOut, String status, boolean isPresent, boolean isAbsent) {
        this.employeeId = employeeId;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.status = status;
        this.isPresent = isPresent;
        this.isAbsent = isAbsent;

        computeDuration();
    }

    private void computeDuration() {
        if (timeIn != null && timeOut != null) {
            this.duration = Duration.between(timeIn, timeOut);
            this.hours = duration.toHours();
            this.minutes = duration.toMinutesPart();
            this.total = String.format("%02d:%02d", hours, minutes);
        } else {
            this.duration = Duration.ZERO;
            this.hours = 0;
            this.minutes = 0;
            this.total = "00:00";
        }
    }

    

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalTime timeIn) {
        this.timeIn = timeIn;
        computeDuration();
    }

    public LocalTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalTime timeOut) {
        this.timeOut = timeOut;
        computeDuration();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public boolean isAbsent() {
        return isAbsent;
    }

    public void setAbsent(boolean isAbsent) {
        this.isAbsent = isAbsent;
    }

    public Duration getDuration() {
        return duration;
    }

    public long getHours() {
        return hours;
    }

    public long getMinutes() {
        return minutes;
    }

    public String getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "employeeId='" + employeeId + '\'' +
                ", date=" + date +
                ", timeIn=" + timeIn +
                ", timeOut=" + timeOut +
                ", status='" + status + '\'' +
                ", present=" + isPresent +
                ", total='" + total + '\'' +
                '}';
    }
}
