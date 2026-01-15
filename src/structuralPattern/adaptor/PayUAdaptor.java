package structuralPattern.adaptor;

public class PayUAdaptor implements PaymentProcessor{
    @Override
    public void pay() {
        PayU payU = new PayU();
        payU.payToPayU();
    }
}
