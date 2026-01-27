package java_core.io.basics;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFileReading {
    public static void main(String[] args) {
        File file = new File("resources/votes.csv");

        //Try-with-resources: O Scanner é declarado DENTRO do parênteses do try.
        //O Java vai fechar ele sozinho (sc.close()) quando o bloco terminar.
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}