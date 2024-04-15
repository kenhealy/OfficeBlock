/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 * JavaSPecialist is a sub-class of Employee
 * 
 * Employee is a super-class of JavaSpecialist
 * 
 * @author kheal
 */
public class JavaSpecialist extends Employee{
    
    public JavaSpecialist(String firstName, String surname, int employeeID, String ppsn) {
        super(firstName, surname, employeeID, "Java Specialist", ppsn);
        this.wallet = 100;
        
    }

    @Override
    public String work() {
       
        
        return "I think there is a bug in my code.";
    }
    
}
