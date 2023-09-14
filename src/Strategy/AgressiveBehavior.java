package Strategy;

public class AgressiveBehavior implements RobotBehavior {
    public int moveCommand() {
        return 1;

    }

    @Override
    public String toString() {
        return "AgressiveBehavior:" + "lanza un puño por derecha ";
    }

}
