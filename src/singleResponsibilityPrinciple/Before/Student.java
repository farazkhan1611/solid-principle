package singleResponsibilityPrinciple.Before;

/*
This class violates two principle of SRP
1. cohesion - related code should be together
2. coupling - code should be loosely coupled
3. This class should have only one reason to change
 */
public class Student {
    // Reason to change : format needs to change
    int studentId;
    // Reason to change : format needs to change
    String studentName;

    // Tight coupling with DB
    // Reason to change : DB needs to be replaced with Oracle
    public void save(){
        //saving code goes here
        // Class.forName("org.MSQL.jdbc");
        // note we are using MySQL as db
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}