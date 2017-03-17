import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Parser {

    public static final String commandRegexPattern = "(TURN|STRAIGHT)\\((\\d+),(\\d+)\\)";
    public static final Pattern commandRegex = Pattern.compile(commandRegexPattern);
    
    public static String[] splitCommandList(String commandList) {
        return commandList.split("&");
    }
    
    public static Command parse(String cmd) {
        Matcher m = commandRegex.matcher(cmd);
        
        CommandType commandType;
        double velocity, value;
        if(m.find()) {
            if(m.group(1).equals("TURN")) {
                commandType = CommandType.TURN;
            }
            else if(m.group(1).equals("STRAIGHT")) {
                commandType = CommandType.STRAIGHT;
            }
            else {
                throw new IllegalArgumentException("oh no!");
            }
            velocity = Double.parseDouble(m.group(2));
            value = Double.parseDouble(m.group(3));
        }
        else throw new IllegalArgumentException("oh snap!");
        return new Command(commandType, velocity, value);
    }
}