package behavioural.visitor;

public class FirstVisitor implements Visitor{

    @Override
    public void visitFirstClass(FirstClass firstClass) {
        System.out.println("Do something with First class");
    }

    @Override
    public void visitSecondClass(SecondClass secondClass) {
        System.out.println("Do something with Second class");
    }

    @Override
    public void visitThirdClass(ThirdClass thirdClass) {
        System.out.println("Do something with Third class");
    }
}
