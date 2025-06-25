/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author miiny
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, User> users = new HashMap<>();

    
    public void loadUsersFromCSV(String filePath) {
        String file = "CSV/users.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 3) {
                String empId = parts[0].trim();
                String password = parts[1].trim();
                String position = parts[2].trim();

                users.put(empId, new User(empId, password, position));
            }
        }

        System.out.println("Loaded users: " + users.size());
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    public boolean containsUser(String empId) {
        return users.containsKey(empId);
    }

    public User getUserById(String empId) {
        return users.get(empId);
    }
}

