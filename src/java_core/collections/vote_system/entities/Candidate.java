package java_core.collections.vote_system.entities;

import java.util.Objects;

public class Candidate {
    private int number;
    private String name;
    private String party;

    public Candidate(int number, String name, String party) {
        this.number = number;
        this.name = name;
        this.party = party;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getParty() {
        return party;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return number == candidate.number && Objects.equals(name, candidate.name) && Objects.equals(party, candidate.party);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, party);
    }
}
