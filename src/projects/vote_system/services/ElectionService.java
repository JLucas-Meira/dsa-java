package projects.vote_system.services;

import projects.vote_system.entities.Candidate;
import projects.vote_system.entities.VoteRecord;
import projects.vote_system.entities.Voter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ElectionService {

    private final Set<VoteRecord> validVotes; // Usando Set para garantir que cada voto seja único (não ter duplicatas)

    private final Map<Candidate, Integer> scoreBoard; // Usando Map para relacionar o Candidato com a quantidade de votos dele

    public ElectionService() {
        this.validVotes = new HashSet<>();
        this.scoreBoard = new HashMap<>();
    }

    public void processLog(String filePath) {
        System.out.println("Processing voting logs from: " + filePath + "...");

        // Try-with-resources para fechar o arquivo automaticamente depois
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                // O arquivo CSV tem: ID, NomeEleitor, NumCandidato, NomeCandidato, Partido
                // Preciso pegar cada pedaço e criar os objetos
                String voterId = fields[0];
                String voterName = fields[1];
                int candidateNumber = Integer.parseInt(fields[2]);
                String candidateName = fields[3];
                String candidateParty = fields[4];

                Voter voter = new Voter(voterId, voterName);
                Candidate candidate = new Candidate(candidateNumber, candidateName, candidateParty);

                VoteRecord record = new VoteRecord(voter, candidate);

                // Adicionando no Set. Se o equals/hashCode estiver certo, ele já barra duplicados aqui.
                validVotes.add(record);

                line = br.readLine();
            }

            // Depois de ler tudo e limpar duplicatas, faz a contagem
            consolidateVotes();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: CSV format invalid. Expected 5 fields.");
        }
    }

    private void consolidateVotes() {

        for (VoteRecord vote : validVotes) {

            Candidate candidate = vote.getCandidate();

            // Se o candidato já tem votos, soma +1. Se não, começa com 1.
            if (scoreBoard.containsKey(candidate)) {
                int currentTotal = scoreBoard.get(candidate);
                scoreBoard.put(candidate, currentTotal + 1);
            } else {
                scoreBoard.put(candidate, 1);
            }

        }
    }

    public void printReport() {
        System.out.println("\n--- ELECTION REPORT ---");
        for (Candidate candidate : scoreBoard.keySet()) {
            System.out.println(candidate.getName() + " (" + candidate.getParty() + "): " + scoreBoard.get(candidate) + " votes");
        }
    }
}