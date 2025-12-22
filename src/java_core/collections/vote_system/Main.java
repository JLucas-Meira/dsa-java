package java_core.collections.vote_system;

import java_core.collections.vote_system.services.ElectionService;
// Lembre de importar o Scanner se quiser ler o caminho via teclado

public class Main {
    public static void main(String[] args) {

        ElectionService electionService = new ElectionService();

        String path = "votes.csv";

        electionService.processLog(path);

        electionService.printReport();
    }
}