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
import java.time.Duration;


public class AttendanceTracker {
    

    //Attendance Analyzer
   public static String[] analyze(Attendance record) {
    if (record.getTimeIn() == null || record.getTimeOut() == null) {
        return new String[]{
            "Absent / Missed Log", "-", "-", "-", "-"
        };
    }

    LocalTime startTime = LocalTime.of(8, 0);
    LocalTime endTime = LocalTime.of(17, 0);
    LocalTime grace = startTime.plusMinutes(10);

    String status = "Present";
     Duration lateDuration = Duration.ZERO;
     
     
    if (record.getTimeIn().isAfter(grace)) {
        lateDuration = Duration.between(grace, record.getTimeIn());
        //status = "Late (" + lateDuration.toMinutes() + " mins)";
    }

    Duration total = Duration.between(record.getTimeIn(), record.getTimeOut());
    String totalWorked = String.format("%02d:%02d", total.toHours(), total.toMinutesPart());
    
    Duration otDuration = Duration.ZERO;
    if (record.getTimeOut().isAfter(endTime)) {
        otDuration = Duration.between(endTime, record.getTimeOut());

    }

     String overtimeDisplay = "00:00";

    if (!lateDuration.isZero()) {
        if (!otDuration.isZero()) {
            long lateMins = lateDuration.toMinutes();
            long otMins = otDuration.toMinutes();

            if (otMins >= lateMins) {
                status = "Present (Late fully compensated by " + otMins + " mins)";
            } else {
                long remainingLate = lateMins - otMins;
                status = "Late compensated by (" + otMins + " mins), late (" + remainingLate + " mins)";
            }

       
            overtimeDisplay = "00:00";
        } else {
            status = "Late (" + lateDuration.toMinutes() + " mins)";
        }
    } else {
  
        if (!otDuration.isZero()) {
            overtimeDisplay = String.format("%02d:%02d", otDuration.toHours(), otDuration.toMinutesPart());
        }
    }

    return new String[]{
        status,
        record.getTimeIn().toString(),
        record.getTimeOut().toString(),
        overtimeDisplay,
        totalWorked
    };
}
}
    

