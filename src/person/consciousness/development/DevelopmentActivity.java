package person.consciousness.development;

import institution.KnowledgeSource;
import person.Student;
import person.consciousness.schedule.Schedule;
import java.time.LocalDate;

public class DevelopmentActivity {
    private Schedule schedule;
    private KnowledgeSource source;

    public DevelopmentActivity(KnowledgeSource source, Schedule schedule) {
        this.source = source;
        this.schedule = schedule;
    }

    public void startEvent(Student student, LocalDate date){
        if(schedule.isWorking(student, date)){
            source.teach(student);
        }
    }

    public KnowledgeSource getSource() {
        return source;
    }

}
