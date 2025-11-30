
package com.knmodicollege.collegemanagement.model;

public class Faculty 
{
    // to store faculty id
    private String facultyId;
    // to store faculty name
    private String facultyName;
    // to store qualification
    private String qualification;
    // to store faculty experience (in years)
    private int experience;
    // to store department name
    private String department;
    // to store contact number
    private String contactNumber;

    /--------------------------------------------------------/
    // Default constructor
    public Faculty() {
        super();
    }

    /-------------------------------------------------------/
    // Parameterized constructor
    public Faculty(String facultyId, String facultyName, String qualification,
                   int experience, String department, String contactNumber) {
        super();
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.qualification = qualification;
        this.experience = experience;
        this.department = department;
        this.contactNumber = contactNumber;
    }

    /----------------------------------------------------/
    /----- Getter and Setter ----------/
    public String getFacultyId() {
        return facultyId;
    }
    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /------------------------------------------------/
    @Override
    public String toString() {
        return "Faculty Id : " + facultyId 
                + "\n Faculty Name : " + facultyName 
                + "\n Qualification : " + qualification
                + "\n Experience : " + experience + " years"
                + "\n Department : " + department
                + "\n Contact Number : " + contactNumber
                + "\n------------------------------------\n";
    }

}