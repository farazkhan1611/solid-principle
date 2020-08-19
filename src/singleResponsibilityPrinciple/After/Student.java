package singleResponsibilityPrinciple.After;

/*
This class violates two principle of SRP
1. cohesion - related code should be together
2. coupling - code should be loosely coupled
3. This class should have only one reason to change
 */

// change only if format needs to be changes
class StudentModel {
    // Reason to change : format needs to change
    int studentId;
    // Reason to change : format needs to change
    String studentName;

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

// change only if db needs to change
class StudentRepo {

    public void save(StudentModel student){
        //saving code goes here
        // Class.forName("org.MSQL.jdbc");
        // note we are using MySQL as db
    }
}

// Loosely coupling
public class Student {
    StudentModel student = new StudentModel();
    StudentRepo repo = new StudentRepo();
    public void doSomething(){
        repo.save(student);
    }

}