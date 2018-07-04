package person.consciousness.condition_repo;

import person.consciousness.conditions.ActivityCondition;

import java.time.LocalDate;

public interface ICompositeCondition {
    void add();

    void remove();

    boolean contains(ActivityCondition condition);

    boolean conditionDate(LocalDate date);
}
