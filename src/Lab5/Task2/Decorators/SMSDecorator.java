package Lab5.Task2.Decorators;

import Lab5.Task2.Notifier;

public class SMSDecorator extends Decorator{
    public SMSDecorator(Notifier notifier) {
        super(notifier.sendFor() + "\n \t Message was received via SMS \n", notifier);
    }
}
