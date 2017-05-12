package org.redi.inheritance;

/**
 * Created by redi on 5/8/17.
 */
public class Student extends Person {
    private String studentAttendenCourse;

    public String getStudentAttendenCourse() {
        return studentAttendenCourse;
    }

    public void setStudentAttendenCourse(String studentAttendenCourse) {
        this.studentAttendenCourse = studentAttendenCourse;
    }
}
