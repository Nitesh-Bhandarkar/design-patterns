package structuralPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CombineForce implements Army, Defence{
    private final String name;
    private final List<Army> armyList;

    public CombineForce(String name) {
        this.armyList = new ArrayList<>();
        this.name = name;
    }

    @Override
    public int getSoldierCount() {
        int sum = 0;
        System.out.printf("Count in %s : \n", name);
        for(Army army : armyList){
            sum += army.getSoldierCount();
        }

        System.out.printf("%s \n", sum);
        return sum;
    }

    @Override
    public void addArmy(Army army) {
        armyList.add(army);

    }
}
