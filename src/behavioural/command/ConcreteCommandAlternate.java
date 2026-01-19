package behavioural.command;

public class ConcreteCommandAlternate implements Command{
    private final ReceiverAlternate receiver;

    public ConcreteCommandAlternate(ReceiverAlternate receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doWork();
    }
}
