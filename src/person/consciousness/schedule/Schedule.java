package person.consciousness.schedule;

import person.Student;
import person.consciousness.condition_repo.ICompositeCondition;
import person.consciousness.conditions.ComplexCondition;
import person.consciousness.conditions.PeriodCondition;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Schedule {
    private LocalDate startDate;
    private LocalDate endDate;
    private ICompositeCondition condition;
    private Map<Student, LocalDate> visitedEvents;

    public Schedule(LocalDate startDate, LocalDate endDate, ICompositeCondition condition){
        this.startDate = startDate;
        this.endDate = endDate;
        this.condition = condition;
        visitedEvents = new HashMap<>();
    }

    public boolean isWorking(Student student, LocalDate date) {
        if (date.isBefore(startDate) || date.isAfter(endDate))
            return false;
        else {
            if (condition.conditionDate(date)) {
                if (condition.contains(PeriodCondition.ONCE_A_MONTH)) {
                    if (isNewMonth(visitedEvents.get(student), date) && condition.conditionDate(date)) {
                        visitedEvents.put(student, date);
                        return true;
                    } else {
                        return false;
                    }
                }

                if (condition.contains(PeriodCondition.ONCE_A_WEEK)) {
                    if (isNewWeek(visitedEvents.get(student), date) && condition.conditionDate(date)) {
                        visitedEvents.put(student, date);
                        return true;
                    } else {
                        return false;
                    }
                }

                if (condition.conditionDate(date)) {
                    visitedEvents.put(student, date);
                    return true;
                } else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
    }

    public boolean isNewWeek(LocalDate past, LocalDate now){
        if(past == null)
            return true;
        return now.getDayOfYear() - past.getDayOfYear() >= 7 || now.getYear() > past.getYear();
    }

    public boolean isNewMonth(LocalDate past, LocalDate now){
        if(past == null)
            return true;
        return now.getMonth().ordinal() > past.getMonth().ordinal() || now.getYear() > past.getYear();
    }

}
