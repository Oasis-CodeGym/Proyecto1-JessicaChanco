

import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        
        System.out.println("Selecciona una opción:");
        System.out.println("1. Cifrar texto");
        System.out.println("2. Descifrar texto");
        System.out.println("3. Salir");


        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        String content = "fileName=documento.txt\nkey=3\nciperPath=documentoCifrado.txt";
        String propertiesFilePath = "files/properties.txt";
        FileManager.writeFile(content, propertiesFilePath);
        System.out.println("Archivo properties.txt creado exitosamente.");

        Cipher cipher = new Cipher();
        String inputFilePath = "files/input.txt";
        String outFilePath = "files/output.txt";
        int shift = 3;



        switch(opcion){
            case 1:
                String text = FileManager.readFile(inputFilePath);

                String cifrarTexto = cipher.encrypt(text, shift);

                FileManager.writeFile(cifrarTexto, outFilePath);

                System.out.println("texto cifrado");
                break;


            case 2 :
                String text1 = FileManager.readFile(outFilePath);

                String descifrarTexto = cipher.decryption(text1, shift);
                System.out.println("texto descifrado");

                FileManager.writeFile(descifrarTexto, inputFilePath);
                break;


            case 3 :
                System.out.println("hasta luego amigos");
                break;



        }

    }
}
