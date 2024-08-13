import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConfigFile {
    private static ConfigFile configFile;
    private String configContent;

    private ConfigFile() {
        readConfig();
    }

    public static ConfigFile getInstance() {
        if (configFile == null) {
            configFile = new ConfigFile();
        }
        return configFile;
    }

    public void readConfig() {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\luizc\\advenced-poo-list-2\\Singleton\\config.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
            this.configContent = contentBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getConfig() {
        if (configContent != null) {
            System.out.print(configContent);
        } else {
            System.out.println("Configuração não foi carregada.");
        }
    }
}