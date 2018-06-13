package person;

import person.consciousness.Knowledge;

public class Student {

    private String studentName;
    private Knowledge levelOfKnowledge;

    public Student(String name, int level) {
        //TODO: Implementation is needed
        studentName = name;
        setKnowledge(new Knowledge(level));
    }

    public void setKnowledge(Knowledge knowledge) {
        //TODO: Implementation is needed
        levelOfKnowledge = knowledge;
    }

    public Knowledge getLevelOfKnowledge() {
        return levelOfKnowledge;
    }

    @Override
    public String toString(){
        return this.studentName + ", level of knowledge: " + this.levelOfKnowledge.getLevel() + ".";
    }
}
