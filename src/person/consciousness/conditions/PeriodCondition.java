package person.consciousness.conditions;

import person.consciousness.condition_repo.ICompositeCondition;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public enum PeriodCondition implements ICompositeCondition {
    ON_WEEKDAYS, ALWAYS, ONCE_A_MONTH, ONCE_A_WEEK, NOT_IN_SUMMER;

    @Override
    public void add(ICompositeCondition condition){}

    @Override
    public void remove(ICompositeCondition condition){}

    @Override
    public boolean contains(ICompositeCondition condition){
        return condition.equals(this);
    }

    @Override
    public boolean conditionDate(LocalDate date) {
        switch (this) {
            case ALWAYS:
                return true;
            case ONCE_A_MONTH:
                return true;
            case ONCE_A_WEEK:
                return true;
            case ON_WEEKDAYS:
                return isWeekday(date);
            case NOT_IN_SUMMER:
                return isSummer(date);
            default:
                return false;
        }
    }

    public static boolean isWeekday(LocalDate date)
    {
        return !(date.getDayOfWeek() == DayOfWeek.SUNDAY || date.getDayOfWeek() == DayOfWeek.SATURDAY);
    }

    public static boolean isSummer(LocalDate date){
        return !(date.getMonth() == Month.JUNE || date.getMonth() == Month.JULY || date.getMonth() == Month.AUGUST);
    }
}
