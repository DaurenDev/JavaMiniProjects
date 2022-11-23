package Lab5.Task2.Decorators;

import Lab5.Task2.Notifier;

public class SlackDecorator extends Decorator{

    public SlackDecorator(Notifier notifier) {
        super(notifier.sendFor() + "\n \t Message was received via Slack \n", notifier);
    }
}
