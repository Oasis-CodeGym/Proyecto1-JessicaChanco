

import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Cipher cipher = new Cipher();

        String inputFilePath = "src/input.txt";
        String outFilePath = "src/output.txt";

        int shift = 3;

        String text = FileManager.readFile(inputFilePath);
        String cifrarTexto = cipher.encrypt(text, shift);

        FileManager.writeFile(outFilePath, cifrarTexto);
        System.out.println(" texto cifrado");

    }
}
