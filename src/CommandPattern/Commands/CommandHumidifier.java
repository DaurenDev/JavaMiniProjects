package CommandPattern.Commands;
import CommandPattern.SmartDevices.*;

public class CommandHumidifier implements Command {
    SmartHumidifier humidifier;
    public CommandHumidifier(SmartHumidifier humidifier) {
        this.humidifier = humidifier;
    }

    @Override
    public void execute() {
        this.humidifier.startHumidify();
    }

    @Override
    public void unExecute() {
        this.humidifier.stopHumidify();
    }
}
