package AbstractFactory;

import AbstractFactory.Action.*;
import AbstractFactory.Weapon.*;

public class ElfFactory extends AbstractHeroFactory{
    @Override
    public Action createAction() {
        return new FlyAction();
    }

    @Override
    public Weapon createWeapon() {
        return new Arbalet();
    }
}
