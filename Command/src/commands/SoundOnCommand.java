package commands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import devices.Sound;

public class SoundOnCommand implements Command{
    Sound sound;

    public SoundOnCommand(Sound sound) {
        this.sound = sound;
    }

    public void execute() {
        sound.on();
    }

    public void store() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("commands.txt", true))) {
            writer.write("SoundOnCommand" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            List<String> commands = Files.readAllLines(Paths.get("commands.txt"));
            for (String command : commands) {
                if (command.equals("SoundOnCommand")) {
                    execute();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
