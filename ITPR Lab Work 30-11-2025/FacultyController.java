
package com.knmodicollege.collegemanagement.controller;

import java.util.Scanner;

import com.knmodicollege.collegemanagement.model.Faculty;
import com.knmodicollege.collegemanagement.service.FacultyService;
import com.knmodicollege.collegemanagement.service.impl.FacultyServiceImpl;

public class FacultyController 
{
    private FacultyService facultyService;
    
    //constructor
    public FacultyController()
    {
        //to initialize service
        facultyService = new FacultyServiceImpl();
    }
    
    //user interface for registration of new faculty
    public void registerFacultyUI()
    {
        Scanner sc = new Scanner(System.in);
        
        //input of faculty details
        System.out.print("Enter Faculty ID (e.g., FAC101) : ");
        String facultyId = sc.nextLine();
        
        System.out.print("Enter Faculty Name : ");
        String facultyName = sc.nextLine();
        
        System.out.print("Enter Qualification : ");
        String qualification = sc.nextLine();
        
        System.out.print("Enter Experience (in years) : ");
        int experience = sc.nextInt();
        sc.nextLine(); // consume newline
        
        System.out.print("Enter Department : ");
        String department = sc.nextLine();
        
        System.out.print("Enter Contact Number : ");
        String contactNumber = sc.nextLine();
        
        //calling register method
        facultyService.registerFaculty(
            new Faculty(
                facultyId,
                facultyName,
                qualification,
                experience,
                department,
                contactNumber
            )
        );
    }
}