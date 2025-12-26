package projects.vote_system.entities;

import java.util.Objects;

public class Voter {
    private String id;
    private String name;

    public Voter(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Voter voter = (Voter) o;
        return Objects.equals(id, voter.id) && Objects.equals(name, voter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
