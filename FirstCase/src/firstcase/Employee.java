/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstcase;

/**
 *
 * @author tolga
 */
public class Employee {
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;
    
    
// Constructor
    public Employee (String name, double salary, int workHours, int hireYear) { 
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    
 // Çalışanın maaşı 1000 Tlden fazla ise %3 vergi hesaplanır, değilse 0 döndürür
    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 3 / 100;
        }
        return 0;
    }
    
    
// Çalışanın çalışma saati 40 saatten fazla ise extraHour içinde alacağı ücret tutulur, değilse sıfır döndürür.
    public double bonus () {
        if (this.workHours > 40) {
            int extraHour = this.workHours - 40;
            return extraHour * 30;
        }
        
        return 0;
    }
    
//Verilen bilgilere göre raseSalary() hesaplanır ve raise olarak döndürülür daha sonrasında @Override ederken işime yarayacak
    public double raiseSalary () {
        int workYear = 2021 - this.hireYear;
        double raise = 0;
        double _salary = this.salary + this.tax() + this.bonus();
        
        if (workYear < 10)
            raise = _salary * 5 / 100;
        else if (workYear > 9 && workYear < 20) 
            raise = _salary * 10 / 100;
        else if (workYear > 19)
            raise = _salary * 15 / 100;
        
        return raise;
    }

    
    
// Print kısımları toString() Çalışan bilgileri ve hesaplamalar.
    @Override
    public String toString() {
        double tax = this.tax();
        double bonus = this.bonus();
        double raise = this.raiseSalary();
        
        return "Name: " + this.name + "\n"
                + " Salary: " + this.salary + "\n"
                + " Work Hours: " + this.workHours + "\n"
                + " Hire Year: " + this.hireYear + "\n"
                + " Tax: " + tax + "\n"
                + " Bonus: " + bonus + "\n"
                + " Raising Salary (Yapilacak Zam) : " + raise + "\n"
                + " Salary with tax and bonus: " + (this.salary + bonus - tax) + "\n" // Burada vergiyi maaştan çıkardım Case'de belirtilmemiş ama ekleniyor da olabilir.
                + " Total Salary(Salary + Bonus): " + (this.salary + bonus /* + raise*/) + "\n\n"; // burada 'kendi maaşı' derken kastedilen zamlı maaşsa eğer raise eklenmesi gerekir.
    }
    
    
    
}
