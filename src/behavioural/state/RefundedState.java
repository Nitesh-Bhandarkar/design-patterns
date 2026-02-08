package behavioural.state;

public class RefundedState implements TransactionAction{
    private final Transaction transaction;

    public RefundedState(Transaction transaction) {
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
        System.out.println("Not valid action");
    }
}
