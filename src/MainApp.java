

import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {


        String content = "fileName=properties.txt\nkey1=value1\nkey2=value2";
        String propertiesFilePath = "files/properties.txt";
        FileManager.writeFile(content, propertiesFilePath);
        System.out.println("Archivo properties.txt creado exitosamente.");

        Cipher cipher = new Cipher();

        String inputFilePath = "files/input.txt";
        String outFilePath = "files/output.txt";

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
