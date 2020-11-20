package excercise_3;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamExercises {

    public int addUp(List<Integer> numbers) {
        return 0;
    }

    public List<String> namesAndOrigin(List<Artist> artists) {
        return Collections.emptyList();
    }

    public List<Album> getAlbumsWithAtMostThreeTracks(List<Album> albums) {
        return Collections.emptyList();
    }

    public int calculateMembers(List<Artist> artists) {
        int totalMembers = 0;
        for (Artist artist : artists) {
            List<Artist> members = artist.getMembers();
            totalMembers += members.size();
        }

        return totalMembers;
    }

    public int calculateMembersLambdaWay(List<Artist> artists) {
        return 0;
    }

}
