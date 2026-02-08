package behavioural.state;

public interface TransactionAction {
    void process();

    void failProcess();

    void completeProcess();

    void triggerRefund();

    void processRefund();
}
