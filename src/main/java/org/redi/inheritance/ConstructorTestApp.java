package org.redi.inheritance;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Date;

/**
 * Created by redi on 5/12/17.
 */
public class ConstructorTestApp {

    public static void main(String...args) {


        //object
        Person person1 = new Person();
        Person person2 = new Person("Mohamad", "Sawaya", new Date(), "mohamad@gmal.com");

        Student student1 = new Student("ali", "kalaf", new Date(), "ali@gmail.com", "java");


        person1.setFirstName("Masaoud");
        System.out.println("the name of the guy is" + " " + person1.getFirstName());

        Teacher taecher1=new Teacher("alaa","alosh",new Date(),"alaa@gmail.com","java");
        System.out.println("the name of the teacher"+" "+taecher1.getFirstName());
        System.out.println("the name of the course"+" "+taecher1.getTeachingKurse());






    }

}


