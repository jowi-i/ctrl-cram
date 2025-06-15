/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tracker;

/**
 *
 * @author miiny
 */
import java.time.*;
import model.*;

public class AttendanceTracker {
    

    //Attendance Analyzer
    public  static String[] analyze(Attendance record) {
        if (record.getTimeIn() == null || record.getTimeOut() == null) {
             return new String[] {
            "Absent / Missed Log",
            "-", "-", "-", "-"
        };
        }
    LocalTime startTime = LocalTime.of(8, 0);
    LocalTime endTime = LocalTime.of(17, 0);
    LocalTime grace = startTime.plusMinutes(10);
    
    String status = "Present";
    //la pa
    String late = "";

        if (record.getTimeIn().isAfter(grace)) {
        Duration lateDuration = Duration.between(grace, record.getTimeIn());
        status = "Late for (" + lateDuration.toMinutes() + " mins)";
        }

        Duration total = Duration.between(record.getTimeIn(), record.getTimeOut());
    String totalWorked = total.toHours() + "h " + total.toMinutesPart() + "m";

    String overtime = "-";
    if (record.getTimeOut().isAfter(endTime)) {
        Duration ot = Duration.between(endTime, record.getTimeOut());
        overtime = ot.toHours() + "h " + ot.toMinutesPart() + "m";
    }
return new String[] {
        status,
        record.getTimeIn().toString(),
        record.getTimeOut().toString(),
        overtime,
        totalWorked
    };
  }
}
    

