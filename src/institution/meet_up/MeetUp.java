package institution.meet_up;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import institution.KnowledgeSource;

public class MeetUp implements KnowledgeSource {
    private String themeOfMeetUp;
    private ArrayList<Student> listOfParticipants;
    private Knowledge theoreticalKnowledge;
    private Knowledge practicalKnowledge;

    public MeetUp(String name, double levelOfTheoreticalKnowledge, double levelOfPracticalKnowledge){
        themeOfMeetUp = name;
        listOfParticipants = new ArrayList<Student>();
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


    public void addStudent(Student student) {
        //TODO: Implementation is needed
        listOfParticipants.add(student);
    }

    public String getListOfStudents() {
        //TODO: Implementation is needed
        String students = "";
        for(Student st: listOfParticipants){
            students += st + "\n";
        }
        return students;
    }

    @Override
    public void teach(Student student){
        if(listOfParticipants.indexOf(student) != -1) {
            if(student.HasLaptop()){
                student.study(this.getTheoreticalKnowledge().getLevel(), this.getPracticalKnowledge().getLevel());
            } else {
                student.study(this.getTheoreticalKnowledge().getLevel(), 0);
            }
        }
    }
}
