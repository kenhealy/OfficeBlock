/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author kheal
 */
public class Receptionist extends Employee {
    
    public Receptionist(String firstName, String surname, int employeeID, String ppsn) {
        super(firstName, surname, employeeID, "Receptionist", ppsn);
    }
    
    /**
     * override parent method - create a different string to describe the work done
     * @return a nice String describing the work
     */
    @Override
    public String work(){
        
        return "Hello...how can I help you today? Oh, no just wait while I answer this call...";
    }
}
