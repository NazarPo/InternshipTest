package main;

import institution.interlink.MeetUp;
import institution.self_study.SelfStudy;
import institution.university.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.conditions.ComplexCondition;
import person.consciousness.conditions.DayCondition;
import person.consciousness.schedule.Schedule;
import person.consciousness.development.DevelopmentActivity;
import person.consciousness.development.DevelopmentPlan;
import person.consciousness.conditions.PeriodCondition;

import javax.swing.event.DocumentEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        //Creating students
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

        //Creating activities
        University university = new University("CH.N.U.", 3, 1);
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);


        Internship internship = new Internship(
                "Interlink",
                10,
                10
        );

        for(Student st: university.getListOfStudents()){
            internship.addStudent(st);
        }

        MeetUp meetUp = new MeetUp("MeetUp: OOP Basics", 7, 7, true);
        meetUp.addStudent(student1);
        meetUp.addStudent(student2);
        meetUp.addStudent(student3);
        meetUp.addStudent(student4);

        SelfStudy selfStudy = new SelfStudy(5, 5);

        //Creating dates
        LocalDate universityStartDay = LocalDate.of(2016, 1, 1);
        LocalDate universityEndDay = LocalDate.of(2021, 6, 20);

        LocalDate internshipStartDay = LocalDate.of(2018, 7, 2);
        LocalDate internshipEndDay = LocalDate.of(2018, 10, 2);

        LocalDate meetupStartDay = LocalDate.of(2018, 5, 14);
        LocalDate meetupEndDay = LocalDate.of(2018, 5, 14);

        LocalDate selfstudyStartDay = LocalDate.of(2010, 1, 1);
        LocalDate selfstudyEndDay = LocalDate.of(2021, 6, 20);


        //Creating conditions
        ComplexCondition conditionForUniversity = new ComplexCondition();
        conditionForUniversity.add(PeriodCondition.ON_WEEKDAYS);
        conditionForUniversity.add(PeriodCondition.NOT_IN_SUMMER);

        ComplexCondition conditionForInternship = new ComplexCondition();
        conditionForInternship.add(PeriodCondition.ON_WEEKDAYS);

        ComplexCondition conditionForMeetUp = new ComplexCondition();
        conditionForMeetUp.add(PeriodCondition.ONCE_A_MONTH);
        conditionForMeetUp.add(DayCondition.MONDAY);

        ComplexCondition conditionForSelfStudy = new ComplexCondition();
        conditionForSelfStudy.add(PeriodCondition.ALWAYS);

        Set<Student> persons1 = new HashSet<>();
        persons1.add(student1);
        persons1.add(student2);
        persons1.add(student3);
        persons1.add(student5);
        persons1.add(student6);

        ArrayList<DevelopmentActivity> activities1 = new ArrayList<>();
        activities1.add(new DevelopmentActivity(
                university, new Schedule(universityStartDay, universityEndDay, conditionForUniversity)
        ));
        activities1.add(new DevelopmentActivity(
                internship, new Schedule(internshipStartDay, internshipEndDay, conditionForInternship)
        ));
        activities1.add(new DevelopmentActivity(
                meetUp, new Schedule(meetupStartDay, meetupEndDay, conditionForMeetUp)
        ));
        activities1.add(new DevelopmentActivity(
                selfStudy, new Schedule(selfstudyStartDay, selfstudyEndDay, conditionForSelfStudy)
        ));

        Set<LocalDate> dates1 = new HashSet<>();
        dates1.add(LocalDate.of(2018, 5, 14));
        dates1.add(LocalDate.of(2018, 5, 15));
        dates1.add(LocalDate.of(2018, 7, 5));
        dates1.add(LocalDate.of(2018,7,7));
        dates1.add(LocalDate.of(2018,4,5));

        //Creating plan
        DevelopmentPlan plan1 = createPlan("First plan", persons1, activities1, dates1);
        plan1.implementPlan();
    }


    private static DevelopmentPlan createPlan(String name, Set<Student> students, ArrayList<DevelopmentActivity> activities, Set<LocalDate> dates){
        DevelopmentPlan plan = new DevelopmentPlan(name);
        for(Student st: students){
            plan.addStudent(st);
        }
        for(DevelopmentActivity activity: activities){
            plan.addDevelopmentActivity(activity);
        }
        for(LocalDate date: dates){
            plan.addDateToCalendar(date);
        }
        return plan;
    }
}