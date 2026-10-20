import java.util.ArrayList;

public class MovieDriver {

    public static void main(String[] args) {
        // Create movie tracker
        MovieTracker tracker = new MovieTracker();

        // Initialize movies
        Movie shawShank = new Movie("The Shawshank Redemption", 142, 1994, "R");
        Movie darkKnight = new Movie("The Dark Knight", 152, 2008, "PG-13");
        Movie inception = new Movie("Inception", 148, 2010, "PG-13");
        Movie interstellar = new Movie("Interstellar", 169, 2014, "PG-13");
        Movie parasite = new Movie("Parasite", 132, 2019, "R");

        // Initialize users
        String bob = "Bob";
        String jim = "Jim";
        String ellen = "Ellen";

        // Demonstrate Movie objects can be added

        tracker.addMovie(bob, shawShank);
        tracker.addMovie(bob, inception);
        tracker.addMovie(ellen, parasite);
        tracker.addMovie(ellen, darkKnight);

        // Demonstrate Movie objects can be retrieved
        System.out.println("Bob movie list: " + tracker.getMovies(bob));
        System.out.println("Ellen movie list: " + tracker.getMovies(ellen));

        // Demonstrate hasWatched() works correctly

        System.out.println("Bob has watched parasite - should be false");
        System.out.println(tracker.hasWatched(bob, parasite));
        System.out.println("Ellen has watched parasite - should be true.");
        System.out.println(tracker.hasWatched(ellen, parasite));

        // Demonstrate duplicate movies are not stored for the same user
        tracker.addMovie(jim, interstellar);
        System.out.println("Jim has watched: " + tracker.getMovies(jim));
        System.out.println("Now we will add inception again, and see if a duplicate is created");
        tracker.addMovie(jim, interstellar);
        System.out.println("Jim has watched: " + tracker.getMovies(jim));
    }
    
}
