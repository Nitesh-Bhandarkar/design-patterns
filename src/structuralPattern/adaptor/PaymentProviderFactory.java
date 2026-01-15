package structuralPattern.adaptor;

public class PaymentProviderFactory {
    public static PaymentProcessor getPaymentProcessor(String service){
        switch (service){
            case "RazorPay" -> {
                return new RazorPayAdaptor();
            }
            case "PayU" -> {
                return new PayUAdaptor();
            }
            default -> {
                System.out.println("No service provider");
                return null;
            }
        }
    }
}
