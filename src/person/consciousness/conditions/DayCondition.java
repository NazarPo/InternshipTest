package person.consciousness.conditions;

import person.consciousness.condition_repo.ICompositeCondition;

import java.time.LocalDate;

public enum DayCondition implements ICompositeCondition {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public void add(ICompositeCondition condition){}

    @Override
    public  void remove(ICompositeCondition condition){}

    @Override
    public boolean contains(ICompositeCondition condition){
        return this instanceof DayCondition && condition.equals(this);
    }

    @Override
    public boolean conditionDate(LocalDate date){
        return date.getDayOfWeek().ordinal() == this.ordinal();
    }
}
