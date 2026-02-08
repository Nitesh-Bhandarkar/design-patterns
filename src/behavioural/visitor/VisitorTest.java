package behavioural.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        Visitor visitor = new FirstVisitor();
        Base c1 = new FirstClass();
        c1.acceptVisitor(visitor);

        Base c2 = new SecondClass();
        c2.acceptVisitor(visitor);

        Base c3 = new ThirdClass();
        c3.acceptVisitor(visitor);
    }
}
