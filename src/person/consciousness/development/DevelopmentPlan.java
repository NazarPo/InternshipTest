package person.consciousness.development;

import person.Student;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DevelopmentPlan {
    private Set<Student> listOfStudents;
    private Set<LocalDate> calendar;
    private ArrayList<DevelopmentActivity> activities;
    private String name;

    public DevelopmentPlan(String name) {
        listOfStudents = new HashSet<>();
        activities = new ArrayList<>();
        calendar = new TreeSet<>();
        this.name = name;
    }

    public void addDateToCalendar(LocalDate date){
        calendar.add(date);
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        this.listOfStudents.add(student);
    }

    public void addDevelopmentActivity(DevelopmentActivity event) {
        this.activities.add(event);
    }

    public void implementPlan() {
        System.out.println(name + ": ");
        for(LocalDate date: calendar){
            System.out.println("\n- " + date);
            for (DevelopmentActivity event : activities) {
                System.out.println("\n" + event.getSource().getName());
                for (Student st : listOfStudents) {
                    event.startEvent(st, date);
                }
            }
        }
    }

}
