package behavioural.state;

public class PaymentFailedState implements TransactionAction{
    private final Transaction transaction;

    public PaymentFailedState(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void process() {
        System.out.println("Not valid action");
    }

    @Override
    public void failProcess() {
        System.out.println("Not valid action");

    }

    @Override
    public void completeProcess() {
        System.out.println("Not valid action");

    }

    @Override
    public void triggerRefund() {
        System.out.println("Payment Failed -> Refund Triggered");
        transaction.setState(transaction.getRefundTriggeredState());
    }

    @Override
    public void processRefund() {
        System.out.println("Not valid action");
    }
}
