package AbstractFactory;

import AbstractFactory.Action.*;
import AbstractFactory.Weapon.*;

public class GungsterFactory extends AbstractHeroFactory{
    @Override
    public Action createAction() {
        return new RunAction();
    }

    @Override
    public Weapon createWeapon() {
        return new Gun();
    }
}
