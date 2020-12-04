package excercises.excercise_3;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExercises {

    public static int addUp(List<Integer> numbers) {
        return numbers.stream().reduce(0, (acc, element) -> acc + element);
    }

    public static List<String> namesAndOrigin(List<Artist> artists) {
        return artists.stream().map(artist -> (
                artist.getName() +
                " - " +
                artist.getNationality()
        )).collect(Collectors.toList());
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> albums) {
        return albums
                .stream()
                .filter(artist -> artist.getTracks().count() <= 3)
                .collect(Collectors.toList());
    }

    public static int calculateMembers(List<Artist> artists) {
        int totalMembers = 0;
        for (Artist artist : artists) {
            List<Artist> members = artist.getMembers();
            totalMembers += members.size();
        }

        return totalMembers;
    }

    public static int calculateMembersLambdaWay(List<Artist> artists) {
        return (int) (long) artists
                .stream()
                .map(artist -> artist.getMembers().stream().count())
                .reduce(0L, (acc, membersSum) -> acc + membersSum);
    }


}
