package behavioural.state;

public class StateTest {
    public static void main(String[] args) {
        Transaction successTransaction = new Transaction();
        successTransaction.makePayment();

        Transaction failTransaction = new Transaction();
        failTransaction.makeFailedPayment();


    }
}
