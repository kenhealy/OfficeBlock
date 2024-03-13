/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 * ProjectManager is a sub-class of Employee
 * 
 * Employee is a super-class of Project Manager
 * 
 * @author kheal
 */
public class ProjectManager extends Employee{
    
    public ProjectManager(String firstName, String surname, int employeeID, String ppsn) {
        
        super(firstName, surname, employeeID, "Project Manager", ppsn);
    
    }
    
    /**
     * Note this version of work() will override the parent version
     * @return a nice string describing the work done
     */
    @Override
    public String work(){
        
        return "I am managing this Project";
    }
   
    
    
}
