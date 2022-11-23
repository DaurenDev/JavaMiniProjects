package AbstractFactory;

import AbstractFactory.Action.Action;
import AbstractFactory.Weapon.Weapon;

public class SuperHero {
    private Action action;
    private Weapon weapon;

    public SuperHero(AbstractHeroFactory factory) {
        this.action = factory.createAction();
        this.weapon = factory.createWeapon();
    }

    public void move() {
        this.action.move();
    }

    public void weapon() {
        this.weapon.weapon();
    }
}
