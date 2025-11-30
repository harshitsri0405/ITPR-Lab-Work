package com.knmodicollege.collegemanagement.dao;

import com.knmodicollege.collegemanagement.model.Faculty;
import java.util.ArrayList;

public interface FacultyDAO 
{
    // method for inserting new faculty data
    int save(Faculty facultyData);
    
    // method for updating faculty experience
    int updateFacultyExperience(String facultyId, int experience);
    
    // method to delete the faculty
    int delete(String facultyId);
    
    // method to fetch all faculty list
    ArrayList<Faculty> findAll();
    
    // method to fetch a particular faculty
    Faculty findByFacultyId(String facultyId);
}
