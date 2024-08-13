import devices.*;
import commands.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        RemoteControl remote = new RemoteControl();
        List<Command> allCommands = new ArrayList<>();

        addCommand(remote, allCommands, new CeilingFanHighCommand(new CeilingFan()));
        addCommand(remote, allCommands, new GarageDoorUpCommand(new GarageDoor()));
        addCommand(remote, allCommands, new HottubJetsOnCommand(new Hottub()));
        addCommand(remote, allCommands, new LightOnCommand(new Light()));
        addCommand(remote, allCommands, new SecurityControlArmCommand(new SecurityControl()));
        addCommand(remote, allCommands, new SoundOnCommand(new Sound()));
        addCommand(remote, allCommands, new TvOnCommand(new Tv()));

        System.out.println("\nVishhhhhh, deu uma pane de energia...");
        System.out.println("\nDispositivos reiniciando...\n");

        remote.loadCommands(allCommands);
    }

    private static void addCommand(RemoteControl remote, List<Command> allCommands, Command command) throws Exception {
        command.store();
        remote.setCommand(command);
        remote.buttonWasPressed();
        allCommands.add(command);
    }
}
