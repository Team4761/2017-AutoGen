public class Command {
    public final CommandType commandType;
    public final double velocity, distanceOrAngle;
    public Command(CommandType commandType, double velocity, double distanceOrAngle) {
        this.commandType = commandType;
        this.velocity = velocity;
        this.distanceOrAngle = distanceOrAngle;
    }
    
    @Override
    public String toString() {
        return commandType + " command (velocity: " + velocity + ", value: " + distanceOrAngle + ")";
    }
}