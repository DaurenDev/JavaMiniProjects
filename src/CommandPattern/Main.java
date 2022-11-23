package CommandPattern;


import CommandPattern.Alisa;
import CommandPattern.Commands.CommandHumidifier;
import CommandPattern.Commands.CommandTV;
import CommandPattern.Commands.CommandVacuumCleaner;
import CommandPattern.SmartDevices.*;

public class Main {
    public static void main(String[] args) {

        // DEVICES:
        SmartTV tv = new SmartTV();
        SmartVacuumCleaner cleaner = new SmartVacuumCleaner();
        SmartHumidifier humidifier = new SmartHumidifier();

        Alisa alisa = new Alisa();
        alisa.setCommand(new CommandTV(tv));
        alisa.sayStart();
        alisa.sayStop();

        alisa.setCommand(new CommandHumidifier(humidifier));
        alisa.sayStart();
        alisa.sayStop();

        alisa.setCommand(new CommandVacuumCleaner(cleaner));
        alisa.sayStart();
        alisa.sayStop();
    }
}
//devices:
// TV                           ON | OFF
// VACUUM-CLEANER               START | STOP
// HUMIDIFIER                   START-HUMIDIFY | STOP-HUMIDIFY
// AIR-CLEANER
// LIGHT
// ETC

//------------LAYER

// ALISA