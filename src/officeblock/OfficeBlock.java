/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package officeblock;

import company.Company;
import inpututils.InputUtils;

/**
 *
 * @author kheal
 */
public class OfficeBlock {

   
    //Properties of an 'Office block' (or Office Building)
    private final int numFloors;
    private Company[] tenantCompanies; 
    
    
    //Constructor(s)

    public OfficeBlock(int numFloors) {
        this.numFloors = numFloors;
        this.tenantCompanies = new Company[numFloors];
    }
    
    
    public void addNewCompany(int floorNumber){
         InputUtils myInput = new InputUtils();
         
         String companyName = myInput.askUserForText("Enter Company Name:");
         String ownerName = myInput.askUserForText("Please enter Owner's Name:");
         tenantCompanies[floorNumber] = new Company(companyName, ownerName);
        
        
    }
    
    /**
     * Returns the Company located on the floor specified by floorNumber-1
     * -1 is used here because the number is from a human (starts at 1)
     * but the array is a computer (starts at 0)
     */
    public Company getCompany(int floorNumber){
        
        return this.tenantCompanies[floorNumber-1];
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        InputUtils myInput = new InputUtils();
        
        int numFloors = myInput.askUserForInt("How many floors in your building, sire?", 1, 40);
        
       OfficeBlock myBuilding = new OfficeBlock(numFloors); //Creates the OfficeBlock
        
        int floorNumber = myInput.askUserForInt("What floor would you like to occupy first?", 1, numFloors);
        
        myBuilding.addNewCompany(floorNumber-1); //I need -1 because the array starts at 0 but people start at 1
         
        //only possible because I am still in the OfficeBlock class
        Company currentCompany = myBuilding.getCompany(floorNumber);
        
       
        currentCompany.hireStaff(5); // hire 5 staff - this doesn't work properly yet
        
        currentCompany.startWork();
        
    }
       }
