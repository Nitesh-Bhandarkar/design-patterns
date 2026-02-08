package behavioural.strategy;

public class PlanA implements Strategy{
    @Override
    public void doSomething() {
        System.out.println("Follow Plan A");
    }
}
