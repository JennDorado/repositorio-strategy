package Strategy;

public class DefensiveBehavior implements RobotBehavior {
    public int moveCommand() {
        return -1;

    }

    @Override
    public String toString() {
        return "DefensiveBehavior:" + "if find another robot attack it";
    }

}
