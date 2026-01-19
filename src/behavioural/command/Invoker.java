package behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    List<Command> commands;

    public Invoker() {
        commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    public void startWork() {
        commands.get(0).execute();
    }

    public void startAnotherWork(){
        commands.get(1).execute();
    }
}
