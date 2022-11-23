package AdapterPattern;

public class AUtoEU_Adapter implements EUPowerSupply {
    AUPowerSupply power;
    public AUtoEU_Adapter(AUPowerSupply power) {
        this.power = power;
    }

    @Override
    public void powerEU() {
        this.power.powerAUThreeFlat();
    }
}
