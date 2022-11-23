package CommandPattern.Commands;
import CommandPattern.SmartDevices.*;

public class CommandVacuumCleaner implements Command {
    SmartVacuumCleaner cleaner;
    public CommandVacuumCleaner(SmartVacuumCleaner cleaner) {
        this.cleaner = cleaner;
    }

    @Override
    public void execute() {;
        this.cleaner.start();
    }

    @Override
    public void unExecute() {
        this.cleaner.stop();
    }
}
