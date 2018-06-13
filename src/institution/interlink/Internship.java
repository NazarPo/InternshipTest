package institution.interlink;

import java.util.ArrayList;
import person.Student;

public class Internship {
    private String intershipName;
    private ArrayList<Student> listOfIntershipsStudent;

    public Internship(String name) {
        //TODO: Implementation is needed
        listOfIntershipsStudent = new ArrayList<Student>();
        intershipName = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
        if(student.getLevelOfKnowledge().getLevel() >=3 )
            listOfIntershipsStudent.add(student);
    }

    public String getStudents() {
        //TODO: Implementation is needed
        //return "Andrew Maslenko\nJulia Veselkina\n";
        String students = "";
        for(Student st: listOfIntershipsStudent){
            students += st + "\n";
        }
        return students;
    }

    public String getIntershipName(){
        return intershipName;
    }
}
