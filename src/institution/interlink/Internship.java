package institution.interlink;

import institution.Institution;
import person.Student;

public class Internship extends Institution {
    public Internship(String name, double levelOfTheoreticalKnowledge, double levelOfPracticalKnowledge) {
       super(name, levelOfTheoreticalKnowledge, levelOfPracticalKnowledge);
    }

    public void addStudent(Student student) {
        if(student.getTheoreticalKnowledge() >= 40 && student.getPracticalKnowledge() >= 30)
            this.getListOfStudents().add(student);
    }
}
