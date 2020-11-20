package excercises.excercise_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Artist {

    private String name;
    private List<Artist> members;
    private String nationality;

    public Artist(String name, String nationality) {
        this(name, Collections.emptyList(), nationality);
    }

    public Artist(String name, List<Artist> members, String nationality) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(members);
        Objects.requireNonNull(nationality);
        this.name = name;
        this.members = new ArrayList<>(members);
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public List<Artist> getMembers() {
        return members;
    }

    public String getNationality() {
        return nationality;
    }

    public boolean isSolo() {
        return members.isEmpty();
    }

    public boolean isFrom(String nationality) {
        return this.nationality.equals(nationality);
    }

    @Override
    public String toString() {
        return getName();
    }

}
