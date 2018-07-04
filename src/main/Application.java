package main;

import institution.interlink.MeetUp;
import institution.self_study.SelfStudy;
import institution.university.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.schedule.Schedule;
import person.consciousness.development.DevelopmentActivity;
import person.consciousness.development.DevelopmentPlan;
import person.consciousness.conditions.ActivityCondition;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Student student1 = new Student(
                "Andrew Kostenko",
                50,
                50,
                0.9,
                true
        );

        Student student2 =  new Student(
                "Julia Veselkina",
                45,
                30,
                0.6,
                false
        );

        Student student3 = new Student(
                "Maria Perechrest",
                29,
                26,
                0.2,
                true
        );

        Student student4 = new Student(
                "Oleg Someone",
                42,
                45,
                0.7,
                false
        );

        Student student5 = new Student(
                "Julia Nobody",
                20,
                24,
                0.4,
                true
        );

        Student student6 = new Student(
                "Gregory Anybody",
                21,
                15,
                0.2,
                false
        );

        University university = new University("CH.U.I.", 30, 10);
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);

        Internship internship = new Internship(
                "Interlink",
                100,
                100
        );

        for(Student st: university.getListOfStudents()){
            internship.addStudent(st);
        }

        MeetUp meetUp = new MeetUp("OOP Basics", 70, 70);
        meetUp.addStudent(student1);
        meetUp.addStudent(student2);
        meetUp.addStudent(student3);
        meetUp.addStudent(student4);
        meetUp.addStudent(student5);
        meetUp.addStudent(student6);

        SelfStudy selfStudy = new SelfStudy(65, 50);

        DevelopmentPlan plan = new DevelopmentPlan("First plan");
        plan.addStudent(student1);
        plan.addStudent(student2);
        plan.addStudent(student3);
        plan.addStudent(student5);

        LocalDate universityStartDay = LocalDate.of(2016, 1, 1);
        LocalDate universityEndDay = LocalDate.of(2021, 6, 20);

        LocalDate internshipStartDay = LocalDate.of(2018, 7, 2);
        LocalDate internsipEndDay = LocalDate.of(2018, 10, 2);

        LocalDate meetupStartDay = LocalDate.of(2018, 5, 14);
        LocalDate meetupEndDay = LocalDate.of(2018, 5, 14);

        LocalDate selfstudyStartDay = LocalDate.of(2010, 1, 1);
        LocalDate seldstudyEndDay = LocalDate.of(2021, 6, 20);

        plan.addDevelopmentEvent(new DevelopmentActivity(university, new Schedule(universityStartDay, universityEndDay, ActivityCondition.ON_WEEKDAYS) ));
        plan.addDevelopmentEvent(new DevelopmentActivity(internship,new Schedule(internshipStartDay, internsipEndDay, ActivityCondition.ON_WEEKDAYS) ));
        plan.addDevelopmentEvent(new DevelopmentActivity(meetUp, new Schedule(meetupStartDay, meetupEndDay, ActivityCondition.MONTHLY) ));
        plan.addDevelopmentEvent(new DevelopmentActivity(selfStudy, new Schedule(selfstudyStartDay, seldstudyEndDay, ActivityCondition.ONCE) ));

        LocalDate date1 = LocalDate.of(2018, 5, 14);
        LocalDate date2 = LocalDate.of(2018, 5, 15);
        LocalDate date3 = LocalDate.now();

        plan.addDateToCalendar(date1);
        plan.addDateToCalendar(date2);

        System.out.println(plan.getName() + ":");

        plan.implementPlan();
    }
}