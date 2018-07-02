package person;

import person.consciousness.Knowledge;

public class Student {

    private String studentName;
    private double learningFactor;
    private Knowledge theoreticalKnowledge;
    private Knowledge practicalKnowledge;
    private boolean hasLaptop;

    public Student(String name, double levelOfTheoreticalKnowledge, double levelOfPracticalKnowledge, double factor, boolean hasLaptop) {
        //TODO: Implementation is needed
        this.studentName = name;
        setTheoreticalKnowledge(levelOfTheoreticalKnowledge);
        setPracticalKnowledge(levelOfPracticalKnowledge);
        setLearningFactor(factor);
        this.hasLaptop = hasLaptop;
    }

    public boolean isHasLaptop() {
         return this.hasLaptop;
    }

    public void setTheoreticalKnowledge(double level) {
        //TODO: Implementation is needed
        theoreticalKnowledge = new Knowledge(level);
    }

    public Knowledge getTheoreticalKnowledge() {
        return theoreticalKnowledge;
    }

    public void setPracticalKnowledge(double level) {
        //TODO: Implementation is needed
        practicalKnowledge = new Knowledge(level);
    }

    public Knowledge getPracticalKnowledge() {
        return practicalKnowledge;
    }

    @Override
    public String toString(){
        return this.studentName + ", level of theoretical knowledge: " + this.getTheoreticalKnowledge().getLevel() +
                ", level of practical knowledge:" + this.getPracticalKnowledge().getLevel() + ".";
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

}
