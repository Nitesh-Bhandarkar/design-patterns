package behavioural.chainOfResponsibility;

public class HardwareError extends ErrorDetector{

    public HardwareError(ErrorDetector next) {
        super(next);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        System.out.println("Hardware error detected");
        super.handleRequest(request);
    }
}
