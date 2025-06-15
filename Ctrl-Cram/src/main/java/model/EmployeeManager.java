   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author miiny
 */
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {
    
     private static ArrayList<Employee> employeeList = new ArrayList<>();
    private List<Attendance> allAttendances = new ArrayList<>();
   
    
    
    public void addEmployee(Employee newEmp) {
        employeeList.add(newEmp);
        
    }
    public List<Attendance> getAllAttendances() {
        return allAttendances;
    }
    
    public Employee getEmployeeByID(String employeeID) {
        for (Employee e : employeeList) {
            if (e.getEmployeeByID().equals(employeeID)) {
                return e;
            }
        }
        return null;
    }

    public void editEmployee(Employee editEmp) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeByID().equals(editEmp.getEmployeeByID())) {
                employeeList.set(i, editEmp);
                return;
                
     
            }
        }
    }

    public void deleteEmployee(String employeeID) {
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (e.getEmployeeByID().equals(employeeID)) {
                iterator.remove();
                return;
            }
        }
    }
    public ArrayList<Employee> searchEmployees(String keyword) {
    ArrayList<Employee> results = new ArrayList<>();
    for (Employee emp : employeeList) {
        String id = emp.getEmployeeByID() != null ? emp.getEmployeeByID().toLowerCase() : "";
        String name = emp.getName() != null ? emp.getName().toLowerCase() : "";
        String status = emp.getStatus() != null ? emp.getStatus().toLowerCase() : "";

      if (id.contains(keyword.toLowerCase()) || name.contains(keyword.toLowerCase()) || status.contains(keyword.toLowerCase())) {
            results.add(emp);
        }
    }
               return results;
}

    public ArrayList<Employee> getAllEmployees() {
        return employeeList;
        
    }
    

    public List<Attendance> getAttendanceForEmployee(String employeeID, String selectedMonth, String selectedYear) {
        List<Attendance> records = new ArrayList<>();

        for (Attendance att : allAttendances) {
            if (!att.getEmployeeId().equals(employeeID)) continue;

            LocalDate date = att.getDate();
            String attYear = String.valueOf(date.getYear());
            String attMonth = String.format("%02d", date.getMonthValue());

            if (attYear.equals(selectedYear) && attMonth.equals(selectedMonth)) {
                records.add(att);
            }
        }

        return records;
    }

    //Attendance CSV
 public void loadAttendanceDataFromCSV() {
        allAttendances.clear();

        String CSVFile = "CSV/attendance.csv";

        try (CSVReader reader = new CSVReader(new FileReader(CSVFile))) {
            String[] line;
                
            
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

            while ((line = reader.readNext()) != null) {
                if (line.length < 5) continue;

            String employeeId = line[0];
            LocalDate date = LocalDate.parse(line[2], dateFormatter);
            LocalTime logIn = LocalTime.parse(line[3], timeFormatter);
            LocalTime logOut = LocalTime.parse(line[4], timeFormatter);

                Attendance att = new Attendance(employeeId, date, logIn, logOut, "Present", true, false);

                allAttendances.add(att);
            }
            System.out.println("Loaded attendance records: " + allAttendances.size());
        } catch (IOException e) {
           
}
}
}