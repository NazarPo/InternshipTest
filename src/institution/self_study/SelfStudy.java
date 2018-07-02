package institution.self_study;

import person.Student;
import person.consciousness.Knowledge;
import institution.KnowledgeSource;

public class SelfStudy implements KnowledgeSource {
  private Knowledge theoreticalKnowledge;
  private Knowledge practicalKnowledge;

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

  public SelfStudy(double levelOfTheoreticalKnowledge, double levelOfPracticalKnowledge){
    setTheoreticalKnowledge(new Knowledge(levelOfTheoreticalKnowledge));
    setPracticalKnowledge(new Knowledge(levelOfPracticalKnowledge));
  }

  @Override
  public void teach(Student student){
    student.study(this.getTheoreticalKnowledge().getLevel(), getPracticalKnowledge().getLevel());
  }
}
