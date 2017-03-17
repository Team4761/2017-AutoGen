public class AutoGen {
    public static void main(String[] args) {
        String stream = "TURN(90,90)&STRAIGHT(45,60)";
        String[] commandStrings = Parser.splitCommandList(stream);
        for(String commandString : commandStrings) {
            Command c = Parser.parse(commandString);
            System.out.println(c);
        }
    }
}