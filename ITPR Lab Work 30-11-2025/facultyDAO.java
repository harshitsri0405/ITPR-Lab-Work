package com.knmodicollege.collegemanagement.dao;

import com.knmodicollege.collegemanagement.model.Faculty;
import java.util.ArrayList;

public interface FacultyDAO 
{
    // Method for inserting new faculty data
    int save(Faculty facultyData);
    
    // Method for updating faculty experience
    int updateFacultyExperience(String facultyId, int experience);
    
    // Method to delete a faculty
    int delete(String facultyId);
    
    // Method to fetch all faculty list
    ArrayList<Faculty> findAll();
    
    // Method to fetch a particular faculty
    Faculty findByFacultyId(String facultyId);