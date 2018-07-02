package institution;

import person.Student;
import person.consciousness.Knowledge;

public abstract class KnowledgeSource {
    private Knowledge levelOfTeoreticalKnowledge;
    private Knowledge levelOfPracticalKnowledge;

    public Knowledge getLevelOfTeoreticalKnowledge(){
        return levelOfTeoreticalKnowledge;
    }

    public void setLevelOfTeoreticalKnowledge(double level) {
        levelOfTeoreticalKnowledge = new Knowledge(level);
    }

    public Knowledge getLevelOfPracticalKnowledge(){
        return levelOfPracticalKnowledge;
    }

    public void setLevelOfPracticalKnowledge(double level) {
        levelOfPracticalKnowledge = new Knowledge(level);
    }

    public void giveTeoreticalKnowledge(Student student){};
    public void givePracticalKnowledge(Student student){};
}
