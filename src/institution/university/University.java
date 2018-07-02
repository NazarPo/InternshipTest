package institution.university;

import java.util.ArrayList;
import institution.KnowledgeSource;
import person.Student;
import person.consciousness.Knowledge;
import repositories.StudentsFromFile;

public class University implements KnowledgeSource {
    private String universityName;
    private ArrayList<Student> listOfStudents;
    private Knowledge theoreticalKnowledge;
    private Knowledge practicalKnowledge;

    public Knowledge getTheoreticalKnowledge() {
        return theoreticalKnowledge;
    }

    public void setTheoreticalKnowledge(Knowledge knowledge) {
        this.theoreticalKnowledge = knowledge;
    }

    public Knowledge getPracticalKnowledge() {
        return practicalKnowledge;
    }

    public void setPracticalKnowledge(Knowledge knowledge) {
        this.practicalKnowledge = knowledge;
    }

    public University(String name, double levelOfTheoreticalKnowledge, double levelOfPracticalKnowledge) {
        //TODO: Implementation is needed
        listOfStudents = new ArrayList<Student>();
        universityName = name;

    }

    public void addStudent(Student student) {
        //TODO: Implementation is needed
        listOfStudents.add(student);
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public String getUniversityName() {
        return universityName;
    }

    @Override
    public void teach(Student student){
        if(listOfStudents.indexOf(student) != -1){
            student.study(this.getTheoreticalKnowledge().getLevel(), getPracticalKnowledge().getLevel());
        }
    }
}

