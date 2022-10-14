/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstcase;

import java.util.ArrayList;

/**
 *
 * @author tolga
 */
public class FirstCase {

    /**
     * @param args the command line arguments
     */
    
// ArrayList olarak buraya case ekledim. Dilerseniz Siz de array ekleyebilirsiniz.
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ayse Demir", 900, 40, 2020));
        employees.add(new Employee("Ahmet Demir", 1500, 40, 2005));
        employees.add(new Employee("Fadime Demir", 2000, 43, 1990));
        // Burada caseler ekleyip kodu deneyebilirsiniz.
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        /*for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println(employee.toString());
        }*/

    }
    
}
