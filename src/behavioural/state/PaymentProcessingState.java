package behavioural.state;

public class PaymentProcessingState implements TransactionAction{
    private final Transaction transaction;

    public PaymentProcessingState(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void process() {
        System.out.println("Not valid action");
    }

    @Override
    public void failProcess() {
        System.out.println("Payment Processing -> Payment Failed");
        transaction.setState(transaction.getPaymentFailedState());
    }

    @Override
    public void completeProcess() {
        System.out.println("Payment Processing -> Payment Made");
        transaction.setState(transaction.getPaymentMadeState());

    }

    @Override
    public void triggerRefund() {
        System.out.println("Not valid action");
    }

    @Override
    public void processRefund() {
        System.out.println("Not valid action");
    }
}
