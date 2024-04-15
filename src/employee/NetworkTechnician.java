/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author kheal
 */
public class NetworkTechnician extends Employee{

    public NetworkTechnician(String firstName, String surname, int employeeID, String ppsn) {
        super(firstName, surname, employeeID, "Network Technician", ppsn);
    }

    @Override
    public String work() {
        
        return "That's not the right protocol for this virtual server!";
    }

  
   
    
}
