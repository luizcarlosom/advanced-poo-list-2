package commands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import devices.Hottub;

public class HottubJetsOnCommand implements Command {
    Hottub hottub;
    
    public HottubJetsOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.jetsOn();
    }

    public void store() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("commands.txt", true))) {
            writer.write("HottubJetsOnCommand" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            List<String> commands = Files.readAllLines(Paths.get("commands.txt"));
            for (String command : commands) {
                if (command.equals("HottubJetsOnCommand")) {
                    execute();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
