package AdapterPattern;


import AdapterPattern.*;


public class Main {

        public static void main(String[] args) {
        AUPowerSupply au = new AUPower_1();
        EUPowerSupply eu = new EUPower_1(); // AUPowerSupply

        EUPowerSupply euAdapter = new AUtoEU_Adapter(au);

        au.powerAUThreeFlat();
        eu.powerEU();
        euAdapter.powerEU(); // <-- AU: powerAUThreeFlat
    }
}

