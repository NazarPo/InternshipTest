package person.consciousness.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;

public enum EventCondition {
    ON_WEEKDAYS, ONCE, MONTHLY, WEEKLY;

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
            default:
                return false;
        }
    }

    public static boolean isWeekDay(LocalDate date)
    {
        return !(date.getDayOfWeek() == DayOfWeek.SUNDAY || date.getDayOfWeek() == DayOfWeek.SATURDAY);
    }
}
