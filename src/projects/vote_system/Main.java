package projects.vote_system;

import projects.vote_system.services.ElectionService;

public class Main {
    public static void main(String[] args) {

        ElectionService electionService = new ElectionService();

        String path = "votes.csv";

        electionService.processLog(path);

        electionService.printReport();
    }
}