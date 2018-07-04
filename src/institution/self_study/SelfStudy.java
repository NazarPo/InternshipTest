package institution.self_study;

import person.Student;
import person.consciousness.Knowledge;
import institution.KnowledgeSource;

public class SelfStudy implements KnowledgeSource {
    private Knowledge theoreticalKnowledge;
    private Knowledge practicalKnowledge;

    public double getTheoreticalKnowledge(){
        return theoreticalKnowledge.getLevel();
    }

    public void setTheoreticalKnowledge(Knowledge knowledge){
        this.theoreticalKnowledge = knowledge;
    }

    public double getPracticalKnowledge(){
        return practicalKnowledge.getLevel();
    }

    public void setPracticalKnowledge(Knowledge knowledge){
        this.practicalKnowledge = knowledge;
    }

    public SelfStudy(double levelOfTheoreticalKnowledge, double levelOfPracticalKnowledge){
        setTheoreticalKnowledge(new Knowledge(levelOfTheoreticalKnowledge));
        setPracticalKnowledge(new Knowledge(levelOfPracticalKnowledge));
    }

    public String getName(){
        return "Self-study";
    }

    @Override
    public void teach(Student student){
        student.study(this.getTheoreticalKnowledge(), getPracticalKnowledge());
    }
}
