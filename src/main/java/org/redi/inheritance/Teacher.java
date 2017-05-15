package org.redi.inheritance;

import java.util.Date;

/**
 * Created by redi on 5/8/17.
 */
public class Teacher extends Person  {

    private String teachingKurse;

    public Teacher(String firstName, String lastName, Date dateOfBirth, String email, String teachingKurse){
        super(firstName,lastName,dateOfBirth,email);
        this.teachingKurse=teachingKurse;}

    public String getTeachingKurse() {
        return teachingKurse;
    }

    public void setTeachingKurse(String teachingKurse) {
        this.teachingKurse = teachingKurse;
    }



}
