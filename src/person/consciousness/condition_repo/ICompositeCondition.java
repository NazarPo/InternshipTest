package person.consciousness.condition_repo;

import java.time.LocalDate;

public interface ICompositeCondition {
    void add(ICompositeCondition condition);

    void remove(ICompositeCondition condition);

    boolean contains(ICompositeCondition condition);

    boolean conditionDate(LocalDate date);
}
