package structuralPattern.composite;

public class CompositeTester {
    public static void main(String[] args) {
        CombineForce globalForce = new CombineForce("Global Force");
        CombineForce indiaArmy = new CombineForce("India Army");
        CombineForce usArmy = new CombineForce("United Army");

        indiaArmy.addArmy(new Military(100));
        indiaArmy.addArmy(new Airforce(150));

        usArmy.addArmy(new Navy(200));
        globalForce.addArmy(new SpecialOps(500));
        globalForce.addArmy(indiaArmy);
        globalForce.addArmy(usArmy);

        globalForce.getSoldierCount();

    }
}
