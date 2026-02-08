package behavioural.state;

public class PaymentMadeState implements TransactionAction{
    private final Transaction transaction;

    public PaymentMadeState(Transaction transaction) {
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
