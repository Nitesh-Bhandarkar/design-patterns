package behavioural.chainOfResponsibility;

public class SoftwareError extends ErrorDetector{

    public SoftwareError(ErrorDetector next) {
        super(next);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        System.out.println("Software error detected");
        super.handleRequest(request);
    }
}
