package org.redi.inheritance;

import java.util.Date;

/**
 * Created by redi on 5/8/17.
 */
public class Student extends Person {

    private String studentAttendenCourse;
    public Student(String firstName, String lastName, Date dateOfBirth, String email, String studentAttendenCourse){
        super(firstName,lastName,dateOfBirth,email);
        this.studentAttendenCourse=studentAttendenCourse;
    }


    public String getStudentAttendenCourse() {
        return studentAttendenCourse;
    }

    public void setStudentAttendenCourse(String studentAttendenCourse) {
        this.studentAttendenCourse = studentAttendenCourse;
    }
}
