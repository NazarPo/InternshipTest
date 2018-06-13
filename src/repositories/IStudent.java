package repositories;

import person.Student;
import java.util.ArrayList;

public interface IStudent {
    ArrayList<Student> readStudents();
    void writeStudents();
}