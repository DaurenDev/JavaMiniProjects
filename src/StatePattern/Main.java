package StatePattern;

import StatePattern.Bad.BadContext;
import StatePattern.Bad.WaterType;
import StatePattern.Good.GasState;
import StatePattern.Good.GoodContext;
import StatePattern.Good.LiquidState;

import java.io.FileNotFoundException;
public class Main {
        public static void main(String[] args) throws FileNotFoundException {

                GoodContext context = new GoodContext(new GasState());
                context.heat();
                context.heat();
                context.frost();
                context.heat();
                context.heat();
        }
}
//
// gas - solid - liquid

// gas - liquid
//


// gas -> liquid -> solid
// gas    <-   liquid   <-