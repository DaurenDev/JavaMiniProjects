package AbstractFactory;

import AbstractFactory.Action.Action;
import AbstractFactory.Weapon.Weapon;

public abstract class AbstractHeroFactory {
    public abstract Action createAction();
    public abstract Weapon createWeapon();
}
