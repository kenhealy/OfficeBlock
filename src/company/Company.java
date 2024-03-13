/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company;

import employee.*;

/**
 *
 * @author kheal
 */
public class Company {
    
    
    //PROPERTIES
    private String companyName;
    private String ownerName;
    private Employee e1, e2, e3;

    public Company(String companyName, String ownerName) {
        this.companyName = companyName;
        this.ownerName = ownerName;
        hireStaff(5);
    }
    
    public void hireStaff(int numOfStaff){
     
        //** NOTE FROM KEN **//
        /*
           We will have to change this code in a few weeks
        
           At the moment, it does not use the numOfSTaff at all
        */
        
        //Make a simple employee
        e1 = new Employee("Ken", "Healy", 1, "Menial Android", "12345TY");
        
        //now make a Project Manager
        e2 = new ProjectManager("Sarah", "Costa", 2, "4523623QW");
        
        e3 = new JavaSpecialist("Wesley", "Crusher", 3, "gyeweu21");
        
    }
    
    public void startWork(){
        
        /*
        THIS WILL ALSO NEED TO BE CHANGED
        IT ISN'T GOOD YET
        */
        
        System.out.println(e1);
                
        
        System.out.println(e1.getFirstName() + " is a " + e1.getJobTitle());
        System.out.println(e2.getFirstName() + " is a " + e2.getJobTitle());
        System.out.println(e3.getFirstName() + " is a " + e3.getJobTitle());
        
        
        System.out.println(e1.getFirstName() + " says " + e1.work());
        System.out.println(e2.getFirstName() + " says " +e2.work());
        System.out.println(e3.getFirstName() + " says " +e3.work());
    }
    
}
