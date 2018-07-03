package person;

import institution.KnowledgeSource;
import person.consciousness.Knowledge;

public class Student implements KnowledgeSource
{
    private String studentName;
    private double learningFactor;
    private Knowledge theoreticalKnowledge;
    private Knowledge practicalKnowledge;
    private boolean hasLaptop;

    public Student(String name,
                   double levelOfTheoreticalKnowledge,
                   double levelOfPracticalKnowledge,
                   double factor,
                   boolean hasLaptop
    ) {
        this.studentName = name;
        this.hasLaptop = hasLaptop;
        setLearningFactor(factor);
        setTheoreticalKnowledge(new Knowledge(levelOfTheoreticalKnowledge));
        setPracticalKnowledge(new Knowledge(levelOfPracticalKnowledge));
    }

    public String getName(){
        return studentName;
    }

    public boolean HasLaptop() {
         return this.hasLaptop;
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


    @Override
    public String toString(){
        return this.studentName + ", level of theoretical knowledge: " + this.getTheoreticalKnowledge().getLevel() +
                ", level of practical knowledge: " + this.getPracticalKnowledge().getLevel() + ".";
    }

    public double getLearningFactor(){
        return learningFactor;
    }

    public void setLearningFactor(double factor){
        if(factor < 0)
            this.learningFactor = 0;
        else if(factor > 1)
            this.learningFactor = 1;
        else
            learningFactor = factor;
    }

    public void addTheoreticalKnowledge(double knowledge){
        double currentKnowledge = this.getTheoreticalKnowledge().getLevel();
        this.theoreticalKnowledge.setLevel(currentKnowledge + knowledge * this.getLearningFactor());
        System.out.println(this.studentName + " : " + "theoretical knowledge " + currentKnowledge + " ---> " + this.theoreticalKnowledge.getLevel());
    }

    public void addPracticalKnowledge(double knowledge){
        double currentKnowledge = this.getPracticalKnowledge().getLevel();
        this.practicalKnowledge.setLevel(currentKnowledge + knowledge * this.getLearningFactor());
        System.out.println(this.studentName + " : " + "practical knowledge " + currentKnowledge + " ---> " + this.practicalKnowledge.getLevel());
    }

    public void study(double teorKnowledge, double practKnowledge) {
        this.addTheoreticalKnowledge(teorKnowledge);
        this.addPracticalKnowledge(practKnowledge);
    }

    @Override
    public void teach(Student student){
        student.study(this.theoreticalKnowledge.getLevel(), this.practicalKnowledge.getLevel());
    }
}
