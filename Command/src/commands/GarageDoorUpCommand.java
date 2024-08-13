package commands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import devices.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;
    
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

    public void store() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("commands.txt", true))) {
            writer.write("GarageDoorUpCommand" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            List<String> commands = Files.readAllLines(Paths.get("commands.txt"));
            for (String command : commands) {
                if (command.equals("GarageDoorUpCommand")) {
                    execute();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
