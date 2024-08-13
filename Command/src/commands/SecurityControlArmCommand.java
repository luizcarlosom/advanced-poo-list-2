package commands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import devices.SecurityControl;

public class SecurityControlArmCommand implements Command {
    SecurityControl securityControl;

    public SecurityControlArmCommand(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }

    public void execute() {
        securityControl.arm();
    }

    public void store() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("commands.txt", true))) {
            writer.write("SecurityControlArmCommand" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            List<String> commands = Files.readAllLines(Paths.get("commands.txt"));
            for (String command : commands) {
                if (command.equals("SecurityControlArmCommand")) {
                    execute();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
