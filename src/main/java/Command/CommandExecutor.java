package Command;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {

    private List<Command> commands = new ArrayList<Command>();

    public void addCommand(Command c) {
        commands.add(c);
    }

    public void removeCommand(Command c) {
        commands.remove(c);
    }

    public void execute() {
        for(Command c : commands)
            c.execute();
        commands.clear();
    }
}
