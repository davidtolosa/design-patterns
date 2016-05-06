package design_patterns.command_pattern.example;

/**
 * client
 */
public class Application {
    public static void main(String[] args) {
        //creating commands
        MobilePhone control= new MobilePhone();
        Command lockPhone = new LockPhoneCommand(control);
        Command unlockPhone = new UnlockPhoneCommand(control);
        //calling invoker
        PowerButton button= new PowerButton();
        //unlocking phone screen
        button.pressButton(unlockPhone);
        //locking phone screen
        button.pressButton(lockPhone);
    }
}
