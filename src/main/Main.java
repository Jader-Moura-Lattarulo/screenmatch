package main;

import calculations.RecommendationFilter;
import calculations.TimeCalculator;
import models.Episode;
import models.Movie;
import models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie movie01 = new Movie("About time", 2013);

        movie01.setDurationInMinutes(123);

        movie01.evaluates(10);
        movie01.evaluates(9);
        movie01.evaluates(8.5);

        Movie movie02 = new Movie("Aladdin", 2019);

        movie02.setDurationInMinutes(128);

        movie02.evaluates(10);
        movie02.evaluates(9);
        movie02.evaluates(8.5);

        Series serie01 = new Series("Bones", 2005);

        serie01.setSeasons(12);
        serie01.setEpisodesPerSeason(25);
        serie01.setMinutesPerEpisode(55);

        serie01.evaluates(10);
        serie01.evaluates(9);
        serie01.evaluates(8.5);

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(movie01);
        calculator.includes(movie02);
        calculator.includes(serie01);
        System.out.print(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filters(movie02);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(serie01);
        episode.setTotalViews(350);
        filter.filters(episode);

        var movie03 = new Movie("A Família Mitchell e a Revolta das Máquinas", 2021);
        movie03.evaluates(10);
        movie03.setDurationInMinutes(114);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(movie03);
        moviesList.add(movie02);
        moviesList.add(movie01);

        System.out.println("Tamanho da lista: " + moviesList.size());
        System.out.println("Primeiro filme da lista: " + moviesList.getFirst().getName());

        System.out.println(moviesList);

        System.out.println("toString do filme: " + moviesList.getFirst().toString());
    }
}