/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author miiny
 */
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeManager {
    
     static ArrayList<Employee> employeeList = new ArrayList<>();
    public void addEmployee(Employee newEmp) {
        employeeList.add(newEmp);
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
}