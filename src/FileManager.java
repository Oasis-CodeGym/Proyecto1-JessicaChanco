
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileManager {

    public static String readFile(String filePath) {
        Path path = Paths.get(filePath);
        try {
            return Files.readString(path);
        } catch (IOException error) {
            System.out.println("leer el texto: " + filePath);
            return null;

        }
    }
    public static void writeFile(String content, String filePath) {
        Path path = Paths.get(filePath);
        try {
            Files.writeString(path, content);
        } catch (IOException error) {
            System.out.println("leer el texto: " + filePath);
        }
    }
}
