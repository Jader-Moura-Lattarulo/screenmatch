import br.com.alura.sreenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setName("About time");
        movie.setReleaseYear(2013);
        movie.setDurationInMinutes(123);

        movie.evaluates(10);
        movie.evaluates(9);
        movie.evaluates(8.5);

        movie.displaysTechnicalSheet();

    }
}