package Lab5.Task2.Decorators;

import Lab5.Task2.Notifier;

public abstract class Decorator extends Notifier {
    Notifier notifier;
    public Decorator(String message, Notifier notifier) {
        super(message);
        this.notifier = notifier;
    }
}
