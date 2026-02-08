package behavioural.state;

public class Transaction {
    private InitiatedState initiatedState;
    private PaymentFailedState paymentFailedState;
    private PaymentProcessingState paymentProcessingState;
    private PaymentMadeState paymentMadeState;
    private RefundedState refundedState;
    private RefundTriggeredState refundTriggeredState;

    TransactionAction state;

    public Transaction() {
        initiatedState = new InitiatedState(this);
        paymentFailedState = new PaymentFailedState(this);
        paymentProcessingState = new PaymentProcessingState(this);
        paymentMadeState = new PaymentMadeState(this);
        refundedState = new RefundedState(this);
        refundTriggeredState = new RefundTriggeredState(this);

        state = initiatedState;
    }

    public InitiatedState getInitiatedState() {
        return initiatedState;
    }

    public void setInitiatedState(InitiatedState initiatedState) {
        this.initiatedState = initiatedState;
    }

    public PaymentFailedState getPaymentFailedState() {
        return paymentFailedState;
    }

    public void setPaymentFailedState(PaymentFailedState paymentFailedState) {
        this.paymentFailedState = paymentFailedState;
    }

    public PaymentProcessingState getPaymentProcessingState() {
        return paymentProcessingState;
    }

    public void setPaymentProcessingState(PaymentProcessingState paymentProcessingState) {
        this.paymentProcessingState = paymentProcessingState;
    }

    public PaymentMadeState getPaymentMadeState() {
        return paymentMadeState;
    }

    public void setPaymentMadeState(PaymentMadeState paymentMadeState) {
        this.paymentMadeState = paymentMadeState;
    }

    public RefundedState getRefundedState() {
        return refundedState;
    }

    public void setRefundedState(RefundedState refundedState) {
        this.refundedState = refundedState;
    }

    public RefundTriggeredState getRefundTriggeredState() {
        return refundTriggeredState;
    }

    public void setRefundTriggeredState(RefundTriggeredState refundTriggeredState) {
        this.refundTriggeredState = refundTriggeredState;
    }

    public void makePayment(){
        state.process();
        state.completeProcess();
    }

    public void makeFailedPayment(){
        state.process();
        state.failProcess();
        state.triggerRefund();
        state.processRefund();
    }

    public void setState(TransactionAction state) {
        this.state = state;
    }
}
