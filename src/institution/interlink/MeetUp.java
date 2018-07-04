package institution.interlink;

import institution.Institution;
import person.Student;
import person.consciousness.Knowledge;

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
                setTheoreticalKnowledge(new Knowledge(getTheoreticalKnowledge() * 1.5));
            if(student.HasLaptop())
                student.study(getTheoreticalKnowledge(), getPracticalKnowledge());
            else
                student.study(getTheoreticalKnowledge(), 0);
        }
    }
}