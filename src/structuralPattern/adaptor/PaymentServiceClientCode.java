package structuralPattern.adaptor;

import java.util.Scanner;

public class PaymentServiceClientCode {
    public static void main(String[] args) {

        /**
         * Legacy Code
         * */
        RazorPay razorPay = new RazorPay();
        razorPay.makePayment();


        /**
         * Refactored version*/
        PaymentProcessor processor = new RazorPayAdaptor();
        processor.pay();

        /***
         * Extension with other 3rd party
         * */
        PaymentProcessor processor1 = new PayUAdaptor();
        processor1.pay();

        /**
         * Elegant way by having a provider factory*/
        Scanner scanner = new Scanner(System.in);
        String service = scanner.next();
        PaymentProcessor processor2 = PaymentProviderFactory.getPaymentProcessor(service);
        processor2.pay();
    }
}
