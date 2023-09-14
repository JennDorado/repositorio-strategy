package Strategy;

public class NormalBehavior implements RobotBehavior {

    public int moveCommand() {
        return 0;

    }

    @Override
    public String toString() {
        return "NormalBehavior: " + "if find another robot ignore it";
    }

}
