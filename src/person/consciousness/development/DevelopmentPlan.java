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
    private ArrayList<DevelopmentActivity> events;
    private String name;

    public DevelopmentPlan(String name) {
        listOfStudents = new HashSet<>();
        events = new ArrayList<>();
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
        this.events.add(event);
    }

    public void implementPlan() {
        System.out.println(name + ": ");
        for(LocalDate date: calendar){
            System.out.println("\n- " + date);
            for (DevelopmentActivity event : events) {
                System.out.println("\n" + event.getSource().getName());
                for (Student st : listOfStudents) {
                    event.startEvent(st, date);
                }
            }
        }
    }

}
