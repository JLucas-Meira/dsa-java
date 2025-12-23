package java_core.collections.vote_system;

import java_core.collections.vote_system.services.ElectionService;

public class Main {
    public static void main(String[] args) {

        ElectionService electionService = new ElectionService();

        String path = "votes.csv";

        electionService.processLog(path);

        electionService.printReport();
    }
}