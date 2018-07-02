package institution.university;

import java.util.ArrayList;

import institution.KnowledgeSource;
import person.Student;
import person.consciousness.Knowledge;
import repositories.StudentsFromDB;
import repositories.StudentsFromFile;

public class University extends KnowledgeSource {
    private String universityName;
    private ArrayList<Student> listOfStudents;

    public University(String name) {
        //TODO: Implementation is needed
        listOfStudents = new ArrayList<Student>();
        universityName = name;
        setLevelOfTeoreticalKnowledge(30);
        setLevelOfPracticalKnowledge(10);
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

    @Override
    public void giveTeoreticalKnowledge(Student student){
        if(listOfStudents.indexOf(student) != -1){
            student.setTheoreticalKnowledge(student.getTheoreticalKnowledge().getLevel() +
                    this.getLevelOfTeoreticalKnowledge().getLevel() * student.getLearningFactor()
            );
        }
    }

    @Override
    public void givePracticalKnowledge(Student student){
        if(listOfStudents.indexOf(student) != -1){
            student.setPracticalKnowledge(student.getPracticalKnowledge().getLevel() +
                    this.getLevelOfPracticalKnowledge().getLevel() * student.getLearningFactor()
            );
        }
    }
}
