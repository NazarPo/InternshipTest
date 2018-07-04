package person.consciousness.development;

import person.Student;
import java.time.LocalDate;
import java.util.ArrayList;

public class DevelopmentPlan {
    private ArrayList<Student> listOfStudents;
    private ArrayList<DevelopmentActivity> events;
    private String name;

    public DevelopmentPlan(String name) {
        listOfStudents = new ArrayList<>();
        events = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        this.listOfStudents.add(student);
    }

    public void addDevelopmentEvent(DevelopmentActivity event) {
        this.events.add(event);
    }

    public void implementPlan(LocalDate dateNow) {
        for (DevelopmentActivity event : events) {
            System.out.println("\n" + event.getSource().getName());
            for (Student st : listOfStudents) {
                event.startEvent(st, dateNow);
            }
        }
    }

}
