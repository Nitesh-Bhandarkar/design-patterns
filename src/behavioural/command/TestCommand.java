package behavioural.command;

public class TestCommand {
    public static void main(String[] args) {
        Invoker invoker =  new Invoker();
        invoker.addCommand(new ConcreteCommand(new Receiver()));
        invoker.addCommand(new ConcreteCommandAlternate(new ReceiverAlternate()));

        invoker.startAnotherWork();
        invoker.startWork();
    }
}
