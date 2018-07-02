package main;

import institution.meet_up.MeetUp;
import institution.self_study.SelfStudy;
import institution.university.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.", 30, 10);
        university.addStudent(new Student("Andrew Kostenko", 50, 50, 0.9, true));
        university.addStudent(new Student("Julia Veselkina", 45, 40, 0.6, false));
        university.addStudent(new Student("Maria Perechrest", 29, 26, 0.2, true));

        Internship internship = new Internship("Interlink", 100, 100);
        for(Student st: university.getListOfStudents()){
            internship.setStudent(st);
        }

        MeetUp meetUp = new MeetUp("OOP Basics", 70, 70);
        meetUp.addStudent(new Student("Andrew Kostenko", 50, 50, 0.9, true));
        meetUp.addStudent(new Student("Andrew Kostenko", 50, 44, 0.7, true));
        meetUp.addStudent(new Student("Andrew Kostenko", 35, 30, 0.5, false));
        meetUp.addStudent(new Student("Andrew Kostenko", 24, 30, 0.5, false));
        meetUp.addStudent(new Student("Andrew Kostenko", 70, 50, 0.4, false));
        meetUp.addStudent(new Student("Andrew Kostenko", 44, 40, 0.3, true));

        SelfStudy selfStudy = new SelfStudy(60, 60);

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());



    }
}