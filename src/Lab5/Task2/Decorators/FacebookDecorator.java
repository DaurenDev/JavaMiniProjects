package Lab5.Task2.Decorators;

import Lab5.Task2.Notifier;

public class FacebookDecorator extends Decorator{
    public FacebookDecorator(Notifier notifier) {
        super(notifier.sendFor() + "\n \t Message was received via Facebook \n", notifier);
    }
}
