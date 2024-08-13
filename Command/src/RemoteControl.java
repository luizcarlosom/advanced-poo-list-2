import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import commands.Command;

public class RemoteControl {
    Command slot;
    
    public RemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

    public void loadCommands(List<Command> allCommands){
        for (Command command : allCommands) {
            command.load();
        }
    }

    public void clearCommandsFile() {
        try (FileWriter writer = new FileWriter("commands.txt")) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
