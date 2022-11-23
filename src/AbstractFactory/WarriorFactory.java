package AbstractFactory;

import AbstractFactory.Action.*;
import AbstractFactory.Weapon.*;

public class WarriorFactory extends AbstractHeroFactory{
    @Override
    public Action createAction() {
        return new RunAction();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
