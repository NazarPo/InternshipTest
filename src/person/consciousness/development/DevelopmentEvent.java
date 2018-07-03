package person.consciousness.development;

import institution.KnowledgeSource;
import person.Student;
import person.consciousness.dates.Schedule;
import java.time.LocalDate;

public class DevelopmentEvent {
    private Schedule schedule;
    private KnowledgeSource source;

    public DevelopmentEvent(KnowledgeSource source, Schedule schedule) {
        this.source = source;
        this.schedule = schedule;
    }

    public void startEvent(Student student, LocalDate date){
        if(schedule.isWorking(student, date)){
            source.teach(student);
        }
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public KnowledgeSource getSource() {
        return source;
    }

    public void setSource(KnowledgeSource source) {
        this.source = source;
    }
}
