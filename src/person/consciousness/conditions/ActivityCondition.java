package person.consciousness.conditions;

import person.consciousness.condition_repo.ICompositeCondition;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public enum ActivityCondition implements ICompositeCondition {
    ON_WEEKDAYS, ONCE, MONTHLY, WEEKLY, IN_SUMMER;

    @Override
    public void add(){}

    @Override
    public void remove(){}

    @Override
    public boolean contains(ActivityCondition condition){
        return condition.equals(this);
    }

    @Override
    public boolean conditionDate(LocalDate date) {
        switch (this) {
            case ONCE:
                return true;
            case MONTHLY:
                return true;
            case WEEKLY:
                return true;
            case ON_WEEKDAYS:
                return isWeekDay(date);
            case IN_SUMMER:
                return isSummer(date);
            default:
                return false;
        }
    }

    public static boolean isWeekDay(LocalDate date)
    {
        return !(date.getDayOfWeek() == DayOfWeek.SUNDAY || date.getDayOfWeek() == DayOfWeek.SATURDAY);
    }

    public static boolean isSummer(LocalDate date){
        return date.getMonth() == Month.JUNE || date.getMonth() == Month.JULY || date.getMonth() == Month.AUGUST;
    }
}
