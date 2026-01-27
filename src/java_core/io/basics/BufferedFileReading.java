package java_core.io.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReading {

    public static void main(String[] args) {

        String path = "resources/votes.csv";

        // Instanciamos o FileReader E o BufferedReader dentro dos parênteses.
        // Assim, o Java garante que ambos serão fechados ao final, liberando a memória.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine(); // Lê a primeira linha

            while (line != null) {
                System.out.println(line);
                line = br.readLine(); // Lê a próxima linha
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}