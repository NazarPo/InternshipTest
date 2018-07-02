package institution.meet_up;

import institution.KnowledgeSource;
import person.Student;

import java.util.ArrayList;

public class MeetUp extends KnowledgeSource {
    private String themeOfMeetUp;
    private ArrayList<Student> listOfParticipants;

    public MeetUp(String name){
        themeOfMeetUp = name;
        listOfParticipants = new ArrayList<Student>();
        setLevelOfTeoreticalKnowledge(50);
        setLevelOfPracticalKnowledge(50);
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
    public void giveTeoreticalKnowledge(Student student){
        if(listOfParticipants.indexOf(student) != -1){
            student.setTheoreticalKnowledge(student.getTheoreticalKnowledge().getLevel() +
                    this.getLevelOfTeoreticalKnowledge().getLevel() * student.getLearningFactor()
            );
        }
    }

    @Override
    public void givePracticalKnowledge(Student student){
        if(listOfParticipants.indexOf(student) != -1 && student.isHasLaptop() == true){
            student.setPracticalKnowledge(student.getPracticalKnowledge().getLevel() +
                    this.getLevelOfPracticalKnowledge().getLevel() * student.getLearningFactor()
            );
        }
    }

}
