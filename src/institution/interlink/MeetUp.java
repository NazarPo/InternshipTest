package institution.interlink;

import institution.Institution;
import person.Student;
import person.consciousness.Knowledge;
import java.util.ArrayList;
import institution.KnowledgeSource;

public class MeetUp extends Institution {
    private boolean isInteractive;

    public MeetUp(String name, double levelOfTheoreticalKnowledge, double levelOfPracticalKnowledge, boolean isInteractive) {
        super(name, levelOfTheoreticalKnowledge, levelOfPracticalKnowledge);
        this.isInteractive = isInteractive;
    }

    public boolean IsInteractive() {
        return isInteractive;
    }

    public void teach(Student student) {
        if (this.getListOfStudents().contains(student)) {
            if(isInteractive)
                student.study(getTheoreticalKnowledge() * 1.5, 0);
            else
                student.study(getTheoreticalKnowledge(), 0);
            if(student.HasLaptop())
                student.study(0, getPracticalKnowledge());
        }
    }
}