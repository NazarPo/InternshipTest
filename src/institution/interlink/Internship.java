package institution.interlink;

import java.util.ArrayList;

import person.Student;
import institution.KnowledgeSource;
import person.consciousness.Knowledge;

public class Internship implements KnowledgeSource {
    private String intershipName;
    private ArrayList<Student> listOfIntershipsStudent;
    private Knowledge theoreticalKnowledge;
    private Knowledge practicalKnowledge;

    public Internship(String name, double levelOfTheoreticalKnowledge, double levelOfPracticalKnowledge) {
        //TODO: Implementation is needed
        listOfIntershipsStudent = new ArrayList<Student>();
        intershipName = name;
        this.setTheoreticalKnowledge(new Knowledge(levelOfTheoreticalKnowledge));
        this.setPracticalKnowledge(new Knowledge(levelOfPracticalKnowledge));
    }

    public Knowledge getTheoreticalKnowledge(){
        return theoreticalKnowledge;
    }

    public void setTheoreticalKnowledge(Knowledge knowledge){
        this.theoreticalKnowledge = knowledge;
    }

    public Knowledge getPracticalKnowledge(){
        return practicalKnowledge;
    }

    public void setPracticalKnowledge(Knowledge knowledge){
        this.practicalKnowledge = knowledge;
    }


    public void setStudent(Student student) {
        //TODO: Implementation is needed
        if(student.getTheoreticalKnowledge().getLevel() >=3 && student.getPracticalKnowledge().getLevel() >= 3)
            listOfIntershipsStudent.add(student);
    }

    public String getStudents() {
        //TODO: Implementation is needed
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
    public void teach(Student student){
       if(listOfIntershipsStudent.indexOf(student) != -1){
            student.study(this.getTheoreticalKnowledge().getLevel(), getPracticalKnowledge().getLevel());
       }
    }

}
