package behavioural.state;

public class RefundTriggeredState implements TransactionAction{
    private final Transaction transaction;

    public RefundTriggeredState(Transaction transaction) {
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
        System.out.println("Not valid action");

    }

    @Override
    public void processRefund() {
        System.out.println("Refund Triggered -> Refunded");
        transaction.setState(transaction.getRefundedState());

    }
}
