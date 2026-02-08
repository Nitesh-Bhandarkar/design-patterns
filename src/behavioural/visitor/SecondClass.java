package behavioural.visitor;

public class SecondClass extends Base {
    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitSecondClass(this);
    }
}
