package institution.self_study;

import institution.KnowledgeSource;
import person.Student;

public class SelfStudy extends KnowledgeSource {

    public SelfStudy(){
        setLevelOfTeoreticalKnowledge(70);
        setLevelOfPracticalKnowledge(70);
    }

    @Override
    public void giveTeoreticalKnowledge(Student student){
        student.setTheoreticalKnowledge(student.getTheoreticalKnowledge().getLevel() +
                this.getLevelOfTeoreticalKnowledge().getLevel() * student.getLearningFactor()
        );

    }

    @Override
    public void givePracticalKnowledge(Student student){
        student.setPracticalKnowledge(student.getPracticalKnowledge().getLevel() +
                this.getLevelOfPracticalKnowledge().getLevel() * student.getLearningFactor()
        );
    }

}
