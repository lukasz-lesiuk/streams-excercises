import excercises.excercise_1.Action;
import excercises.excercise_1.Lama;
import excercises.excercise_2.Lambdas;
import excercises.excercise_3.Album;
import excercises.excercise_3.Artist;
import excercises.excercise_3.StreamExercises;
import excercises.excercise_3.Track;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        Lama lama = new Lama();
        //anonymous class
        lama.performLamaAction(new Action() {
            @Override
            public void perform2() {
                System.out.println("spit");
            }

            @Override
            public void perform() {
                System.out.println("go away");
            }
        });

        lama.performLamaAction(new Action() {
            @Override
            public void perform() {
                lama.setStanding(false);
                System.out.println( "lama is now standing <- this statement is now " + lama.isStanding());
            }

            @Override
            public void perform2() {
                System.out.println("do sth else");
            }
        });

        //predicate------------------------------------
        System.out.println( "Lama has 3 apples < this is " + Lambdas.hasThreeApples.test(lama.getLamaApples()));
        System.out.println("(v2) Lama has 3 apples < this is " + Lambdas.hasThreeApples2().test(lama.getLamaApples()));

        //consumer----------------------------------
        Lambdas.giveColor().accept(lama.getColor());


        //function------------------------------------
        System.out.println(lama.getScream());
        lama.setScream(Lambdas.makeItLouder().apply(lama.getScream()));
        System.out.println(lama.getScream());

        Integer n = 5;
        System.out.println(n);
        n = Lambdas.makeItBigger().apply(n);
        System.out.println(n);

        //supplier-----------------------------------
        //TODO

        //steams------------------------------------------
        //addup------------------------------------------------

        //v1
        int count = Stream.of(1, 2, 3, 4)
                .reduce(0, (sum, element) -> sum + element);

        List<Integer> numbers = Stream.of(1, 2, 3 ,4).collect(Collectors.toList());

        //v2
        int count2 = numbers.stream()
                .reduce(0, (sum, element) -> sum + element);

        int conut3 = StreamExercises.addUp(numbers);

        //map--------------------------------------------
        Artist artist = new Artist("Lama", "Tibet");
        Artist artist2 = new Artist("Alpaka", "Peru");

        List<Artist> artists = Stream.of(artist, artist2).collect(Collectors.toList());
        System.out.println(StreamExercises.namesAndOrigin(artists));

        //filter-----------------------------------------
        Track track1 = new Track("track1" ,121);
        Track track2 = new Track("track2" ,1243);
        Track track3 = new Track("track3" ,123);
        Track track4 = new Track("track4" ,1321);

        Album album1 = new Album("album1",
                Stream.of(track1, track2, track3).collect(Collectors.toList()),
                Stream.of(artist).collect(Collectors.toList()));

        Album album2 = new Album("album2",
                Stream.of(track1, track2).collect(Collectors.toList()),
                Stream.of(artist).collect(Collectors.toList()));

        Album album3 = new Album("album3",
                Stream.of(track1, track2, track3, track4).collect(Collectors.toList()),
                Stream.of(artist).collect(Collectors.toList()));

        List<Album> albums = Stream.of(album1, album2, album3).collect(Collectors.toList());
        List<Album> sortedAlbums = StreamExercises.getAlbumsWithAtMostThreeTracks(albums);

        //refactor---------------------------------------
        Artist artist3 = new Artist("artist3",
                Stream.of(artist, artist2).collect(Collectors.toList()),
                "Bhutan");
        //inner function
        Integer memeberCount = (int) (long) artist3.getMembers().stream().count();

        List<Artist> artistsForRefactorTask = Stream.of(artist3, artist3, artist3).collect(Collectors.toList());

        System.out.println("Value calculated lambda way: " +
                StreamExercises.calculateMembersLambdaWay(artistsForRefactorTask));
        System.out.println("Value calculated regular way: " +
                StreamExercises.calculateMembers(artistsForRefactorTask));
    }


}
