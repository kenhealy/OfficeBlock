/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company;

import Generators.NameGenerator;
import employee.*;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kheal
 */
public class Company {
    
    
    //PROPERTIES
    private String companyName;
    private String ownerName;
    private ArrayList<Employee> staff ; 
    private int nextAvailableEmpID;

    public Company(String companyName, String ownerName) {
        this.companyName = companyName;
        this.ownerName = ownerName;
        this.staff = new ArrayList<Employee>(); //an empty list of employees
        this.nextAvailableEmpID =1;
    }
    
    public void hireStaff(int numOfStaff){
     
        //** NOTE FROM KEN **//
        
        
        for (int i=0; i< numOfStaff; i++){
            
            NameGenerator ng = new NameGenerator();
            String wholename = ng.getRandomName();
            
            Random r = new Random();
            
            int pick = r.nextInt(4); //not quite perfect yet
            
            String firstName, surname;
            
            firstName = wholename.split(" ")[0];
            surname = wholename.split(" ")[1];
            
            
            int empID = this.nextAvailableEmpID;
            this.nextAvailableEmpID++; //make sure it increases
            
            String PPSN = "1234567X"; //silly default
            
            //use a decision to pick the job title
            switch (pick){
                
                case 0:
                    //Java Specialist
                    staff.add(new JavaSpecialist(firstName, surname, empID, PPSN));
                    break;
                case 1:
                    // ProjectManager
                    staff.add(new ProjectManager(firstName, surname, empID, PPSN));
                    break;
                case 2:
                    // Receptionist
                                     
                    staff.add(new Receptionist(firstName, surname, empID, PPSN));
                    break;
                case 3:
                    staff.add(new NetworkTechnician(firstName, surname, empID, PPSN));
                    break;
                default:
                    System.out.println("ERROR! Invalid Employee Type!");
            }
        }
    }
    
    
    public void startWork(){
        
        /* 
            for ( int i=0; i< staff.size() ; i++){
        
                String name = staff.get(i).getFirstName();
            }
        */
        
        //this is a fancy way of doing the loop :)
        for (Employee e: staff){
            
            System.out.println(e.getFirstName() + " is a " + e.getJobTitle() + " and says " + e.work());
        }
        
       
    }
    
}
