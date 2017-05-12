package org.redi.inheritance;

/**
 * Created by redi on 5/8/17.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("hello");
        Student s=new Student();
        s.setFirstName("Masaoud");
        s.setLastName("Khallouf");
        System.out.println("The student is :{"+s.getFirstName()+" "+s.getLastName()+"}");
        Teacher t= new Teacher();
        t.setFirstName("Alaa");
        t.setLastName("Alaa");
        System.out.println("the teacher is :{"+t.getFirstName()+" "+t.getLastName()+"}");
    }
}
