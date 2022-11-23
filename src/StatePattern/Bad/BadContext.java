package StatePattern.Bad;

public class BadContext {
    WaterType type;
    public BadContext(WaterType type) {
        this.type = type;
    }

    public void heat() {
        if(this.type == WaterType.GAS) {
            System.out.println(">>GAS<<");
        } else if(this.type == WaterType.LIQUID) {
            System.out.println("LIQUID -> GAS");
        } else if(this.type == WaterType.SOLID) {
            ///
        }
    }

    public void frost() {
        if(this.type == WaterType.GAS) {
            System.out.println("GAS -> LIQUID");
        } else if(this.type == WaterType.LIQUID) {
            System.out.println(">>LIQUID<<");
        } else if(this.type == WaterType.SOLID) {
            ///
        }
    }
}
