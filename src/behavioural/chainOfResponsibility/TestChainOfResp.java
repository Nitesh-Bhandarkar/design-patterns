package behavioural.chainOfResponsibility;

public class TestChainOfResp {
    public static void main(String[] args) {
        AbstractRequest request = new ErrorRequest();
        ErrorDetector detector = new HardwareError(null);
        SoftwareError swError = new SoftwareError(detector);

        swError.handleRequest(request);

    }
}
