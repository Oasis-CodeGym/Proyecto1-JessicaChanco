import javax.crypto.Cipher;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Cipher cipher = new Cipher();

        String inputFilePath = "input.texto";
        String outFilePath = "output.texto";

        int shift = 3;

        try {
            String text = FileManager.readFile(inputFilePath);
            String cifrarTexto = cipher.encrypt(text, shift);

            FileManager.writeFile(outFilePath, cifrarTexto);
            System.out.println(" texto cifrado");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
