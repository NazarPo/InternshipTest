package institution;

import person.Student;
import person.consciousness.Knowledge;
import java.util.ArrayList;

public class Institution implements KnowledgeSource {
    private String institutionName;
    private ArrayList<Student> listOfStudents;
    private Knowledge theoreticalKnowledge;
    private Knowledge practicalKnowledge;

    public Institution(String name, double levelOfTheoreticalKnowledge, double levelOfPracticalKnowledge){
        listOfStudents = new ArrayList<>();
        institutionName = name;
        setTheoreticalKnowledge(new Knowledge(levelOfTheoreticalKnowledge));
        setPracticalKnowledge(new Knowledge(levelOfPracticalKnowledge));
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

    public String getName(){
        return institutionName;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public String printStudents() {
        //TODO: Implementation is needed
        String students = "";
        for(Student st: listOfStudents){
            students += st + "\n";
        }
        return students;
    }

    public void addStudent(Student student) {
        listOfStudents.add(student);
    }

    @Override
    public void teach(Student student){
        if(listOfStudents.contains(student)){
            student.study(this.getTheoreticalKnowledge().getLevel(), this.getPracticalKnowledge().getLevel());
        }
    }
}
