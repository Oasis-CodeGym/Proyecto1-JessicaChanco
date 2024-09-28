

import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Cipher cipher = new Cipher();

        String inputFilePath = "src/input.txt";
        String outFilePath = "src/output.txt";

        int shift = 3;
        //leemos el archivo input
        //luego se encrypta
        //despues se escribe en output

        String text = FileManager.readFile(inputFilePath);

        String cifrarTexto = cipher.encrypt(text, shift);

        FileManager.writeFile(cifrarTexto, outFilePath);

        System.out.println("texto cifrado");
        //leemos el archivo output
        //luego desencriptamos
        //despues escribimos en input
        String text1 = FileManager.readFile(outFilePath);

        String descifrarTexto = cipher.decryption(text1, shift);
        System.out.println("texto descifrado");

        FileManager.writeFile(descifrarTexto, inputFilePath);

    }
}
