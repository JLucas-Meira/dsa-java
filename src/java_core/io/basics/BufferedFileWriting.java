package java_core.io.basics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWriting {
    public static void main(String[] args) {
        String [] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};

        String path = "resources/BWTest.txt";

        //Adicionando o parametro true(path, true), o arquivo não sera recriado toda vez que o programa rodar.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path ))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
