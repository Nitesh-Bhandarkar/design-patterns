package structuralPattern.adaptor;

public class RazorPayAdaptor implements PaymentProcessor{
    @Override
    public void pay() {
        RazorPay razorPay = new RazorPay();
        razorPay.makePayment();
    }
}
