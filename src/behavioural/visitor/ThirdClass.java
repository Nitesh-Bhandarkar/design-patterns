package behavioural.visitor;

public class ThirdClass extends Base{
    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitThirdClass(this);
    }
}
