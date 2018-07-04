package institution.interlink;

import institution.Institution;
import person.Student;
import person.consciousness.Knowledge;
import java.util.ArrayList;
import institution.KnowledgeSource;

public class MeetUp extends Institution {
    public MeetUp(String name, double levelOfTheoreticalKnowledge, double levelOfPracticalKnowledge){
        super(name, levelOfTheoreticalKnowledge,levelOfPracticalKnowledge);
    }

    public void teach(Student student){
        if(this.getListOfStudents().contains(student)) {
            if(student.HasLaptop()){
                student.study(this.getTheoreticalKnowledge(), this.getPracticalKnowledge());
            } else {
                student.study(this.getTheoreticalKnowledge(), 0);
            }
        }
    }
}
