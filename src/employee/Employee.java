/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author kheal
 */
public class Employee {
    
    //PROPERTIES (attributes)
    private String firstName;
    private String surname;
    private int employeeID;
    private String jobTitle;
    private String ppsn;
    protected double wallet; //can be accessed by child class
    
    //Constructors

    public Employee(String firstName, String surname, int employeeID, String jobTitle, String ppsn) {
        
        this.firstName = firstName;
        this.surname = surname;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.ppsn = ppsn;
        this.wallet = 0;
        
    }

    //METHODS (Abilities/ Behaviours)
   
    public String work(){
        
        return ("Hi ho, hi ho...it's off to work I go");
    }

    
    //GETTERS AND SETTERS
    
    // RULE -- ONLY HAVE A SETTER IF YOU SHOULD BE ABLE TO CHANGE THE VALUE!
    
    //RULE -- ONLY HAVE A GETTER IF 'SOMETHING ELSE' IS ALLOWED TO SEE THE VALUE
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getPpsn() {
        return ppsn;
    }

    
   

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getWallet() {
        return wallet;
    }

   
    @Override
   public String toString(){
       
       return this.firstName + "\n" + "" + this.surname + "\nJob Title:\t" + this.jobTitle;
   }

    
    
}
