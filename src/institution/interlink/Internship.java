package institution.interlink;

import java.util.ArrayList;

import institution.KnowledgeSource;
import person.Student;
import person.consciousness.Knowledge;

public class Internship extends KnowledgeSource {
    private String intershipName;
    private ArrayList<Student> listOfIntershipsStudent;

    public Internship(String name) {
        //TODO: Implementation is needed
        listOfIntershipsStudent = new ArrayList<Student>();
        intershipName = name;
        setLevelOfTeoreticalKnowledge(50);
        setLevelOfPracticalKnowledge(50);
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
        if(student.getTheoreticalKnowledge().getLevel() >=3 && student.getPracticalKnowledge().getLevel() >= 3)
            listOfIntershipsStudent.add(student);
    }

    public String getStudents() {
        //TODO: Implementation is needed
        //return "Andrew Maslenko\nJulia Veselkina\n";
        String students = "";
        for(Student st: listOfIntershipsStudent){
            students += st + "\n";
        }
        return students;
    }

    public String getIntershipName(){
        return intershipName;
    }

    @Override
    public void giveTeoreticalKnowledge(Student student){
       if(listOfIntershipsStudent.indexOf(student) != -1){
           student.setTheoreticalKnowledge(student.getTheoreticalKnowledge().getLevel() +
                   this.getLevelOfTeoreticalKnowledge().getLevel() * student.getLearningFactor()
           );
       }
    }

    @Override
    public void givePracticalKnowledge(Student student){
        if(listOfIntershipsStudent.indexOf(student) != -1){
            student.setPracticalKnowledge(student.getPracticalKnowledge().getLevel() +
                    this.getLevelOfPracticalKnowledge().getLevel() * student.getLearningFactor()
            );
        }
    }


}
