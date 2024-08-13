package commands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import devices.CeilingFan;

public class CeilingFanHighCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.high();
    }

    public void store() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("commands.txt", true))) {
            writer.write("CeilingFanHighCommand" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            List<String> commands = Files.readAllLines(Paths.get("commands.txt"));
            for (String command : commands) {
                if (command.equals("CeilingFanHighCommand")) {
                    execute();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
