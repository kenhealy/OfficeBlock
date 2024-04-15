/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author kheal
 */
public abstract class Employee {
    
    //PROPERTIES (attributes)
    private String firstName;
    private String surname;
    private final int employeeID;
    private String jobTitle;
    private final String ppsn;
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
   
    /**
     * Simple method to describe the work done
     * @return a String describing the work done
     */
    public abstract String work(); // any child of EMployee must have a work method

    
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
