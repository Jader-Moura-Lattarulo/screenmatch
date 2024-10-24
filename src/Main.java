import calculations.TimeCalculator;
import models.Movie;
import models.Series;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setName("About time");
        movie.setReleaseYear(2013);
        movie.setDurationInMinutes(123);

        movie.evaluates(10);
        movie.evaluates(9);
        movie.evaluates(8.5);

        Movie movie02 = new Movie();

        movie02.setName("Aladdin");
        movie02.setReleaseYear(2019);
        movie02.setDurationInMinutes(128);

        movie02.evaluates(10);
        movie02.evaluates(9);
        movie02.evaluates(8.5);

        Series serie = new Series();

        serie.setName("Bones");
        serie.setReleaseYear(2005);
        serie.setSeasons(12);
        serie.setEpisodesPerSeason(25);
        serie.setMinutesPerEpisode(55);

        serie.evaluates(10);
        serie.evaluates(9);
        serie.evaluates(8.5);

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(movie);
        calculator.includes(movie02);
        calculator.includes(serie);
        System.out.print(calculator.getTotalTime());

    }
}