package answers.excercise_3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercises {

    public int addUp(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (acc, num) -> acc + num);
    }

    public List<String> namesAndOrigin(List<excercises.excercise_3.Artist> artists) {
        return artists.stream()
                .map(artist -> artist.getName() + ", " + artist.getNationality())
                .collect(Collectors.toList());
    }

    public List<excercises.excercise_3.Album> getAlbumsWithAtMoseThreeTracks(List<excercises.excercise_3.Album> albums) {
        return albums.stream()
                .filter(album -> album.getTrackList().size() <= 3)
                .collect(Collectors.toList());
    }

    public int calculateMembers(List<excercises.excercise_3.Artist> artists) {
        int totalMembers = 0;
        for (excercises.excercise_3.Artist artist : artists) {
            Stream<excercises.excercise_3.Artist> members = artist.getMembers();
            totalMembers += members.count();
        }

        return totalMembers;
    }

    public int calculateMembersLambdaWay(List<excercises.excercise_3.Artist> artists) {
        return (int) artists.stream()
                .flatMap(artist -> artist.getMembers())
                .count();
    }

}
