package CommandPattern;

import CommandPattern.Commands.Command;

public class Alisa {
    Command command;
    public void setCommand(Command command) {
        this.command = command;
    }

    public void sayStart() {
        this.command.execute();
    }

    public void sayStop() {
        this.command.unExecute();
    }
}
