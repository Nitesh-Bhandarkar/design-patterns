package behavioural.visitor;

public class FirstClass extends Base {
    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitFirstClass(this);
    }
}
