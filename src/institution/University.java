package institution;

import java.util.ArrayList;
import person.Student;
import repositories.StudentsFromDB;
import repositories.StudentsFromFile;

public class University {
    private String universityName;
    private ArrayList<Student> listOfStudents;

    public University(String name) {
        //TODO: Implementation is needed
        listOfStudents = new ArrayList<Student>();
        universityName = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
        //Don't understand what I have to write here, what logic must be in this method
    }

    public void addStudent(Student student) {
        //TODO: Implementation is needed
        listOfStudents.add(student);
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public String getUniversityName(){
        return universityName;
    }

    public void readStudents(){
        new StudentsFromFile().readStudents();
        // or new StudentsFromDB().readStudents();
    }

    public void writeStudents(){
        new StudentsFromFile().writeStudents();
        // or new StudentsFromDB().writeStudents();
    }
}
