package CommandPattern.Commands;
import CommandPattern.SmartDevices.*;
public class CommandTV implements Command {
    SmartTV tv;
    public CommandTV(SmartTV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.on();
    }

    @Override
    public void unExecute() {
        this.tv.off();
    }
}
