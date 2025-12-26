package projects.vote_system.entities;

import java.util.Objects;

public class VoteRecord {
    private Voter voter;
    private Candidate candidate;

    public VoteRecord(Voter voter, Candidate candidate) {
        this.voter = voter;
        this.candidate = candidate;
    }

    public Voter getVoter() {
        return voter;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VoteRecord that = (VoteRecord) o;
        return Objects.equals(voter, that.voter) && Objects.equals(candidate, that.candidate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voter, candidate);
    }
}
