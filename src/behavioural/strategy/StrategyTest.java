package behavioural.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new PlanA());
        context.perform();

        //Let's change the plan
        context.setStrategy(new PlanB());
        context.perform();
    }
}
