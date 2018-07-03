package person.consciousness.development;

import person.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class DevelopmentPlan {
    private ArrayList<Student> listOfStudents;
    private ArrayList<DevelopmentEvent> events;
    private String name;

    public DevelopmentPlan(String name) {
        listOfStudents = new ArrayList<>();
        events = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void addStudent(Student student) {
        this.listOfStudents.add(student);
    }

    public ArrayList<DevelopmentEvent> getEvents() {
        return events;
    }

    public void addDevelopmentEvent(DevelopmentEvent event) {
        this.events.add(event);
    }

    public void implementPlan(LocalDate dateNow) {
        for (DevelopmentEvent event : events) {
            System.out.println("\n" + event.getSource().getName());
            for (Student st : listOfStudents) {
                event.startEvent(st, dateNow);
            }
        }
    }

}
