package behavioural.chainOfResponsibility;

public abstract class ErrorDetector {
    private final ErrorDetector next;

    public ErrorDetector(ErrorDetector next) {
        this.next = next;
    }

    public void handleRequest(AbstractRequest request){
        if(next == null){
            return;
        }
        next.handleRequest(request);
    }
}
