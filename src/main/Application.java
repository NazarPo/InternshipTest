package main;

import institution.university.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 50, 50, 0.9));
        university.addStudent(new Student("Julia Veselkina", 45, 30, 0.6));
        university.addStudent(new Student("Maria Perechrest", 29, 26, 0.2));

        Internship internship = new Internship("Interlink");
        for(Student st: university.getListOfStudents()){
            internship.setStudent(st);
        }





        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}