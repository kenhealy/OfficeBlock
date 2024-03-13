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
    private int numFloors;
    
    private Company c1; 
    
    
    //Constructor(s)
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        InputUtils myInput = new InputUtils();
        
        String companyName = myInput.askUserForText("What is your company name?");
        
        Company myCompany = new Company(companyName, "New Owner");
        
        myCompany.startWork();
        
    }
       }
