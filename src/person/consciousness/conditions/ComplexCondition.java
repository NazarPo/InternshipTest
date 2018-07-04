package person.consciousness.conditions;

import person.consciousness.condition_repo.ICompositeCondition;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ComplexCondition implements ICompositeCondition{
    private Set<ICompositeCondition> conditions;

    public ComplexCondition(){
        conditions = new HashSet<>();
    }

    @Override
    public void add(ICompositeCondition condition){
        conditions.add(condition);
    }

    @Override
    public void remove(ICompositeCondition condition){
        conditions.remove(condition);
    }

    @Override
    public boolean contains(ICompositeCondition condition){
        return conditions.stream().anyMatch(conditionT -> conditionT.contains(condition));
    }

    @Override
    public boolean conditionDate(LocalDate date) {
        return conditions.stream().allMatch(condition -> condition.conditionDate(date));
    }
}
