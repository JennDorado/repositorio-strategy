import Strategy.AgressiveBehavior;
import Strategy.DefensiveBehavior;
import Strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        Robot roboto = new Robot();
        roboto.setName("Mr . Roboto");
        roboto.setBehavior(new AgressiveBehavior());
        System.out.println(roboto.getName());
        roboto.move();

        Robot Wally = new Robot();
        Wally.setName("Mr . Wally");
        Wally.setBehavior(new DefensiveBehavior());
        System.out.println(Wally.getName());
        Wally.move();
    }
}
