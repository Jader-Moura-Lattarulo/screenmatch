package main;

import models.Movie;
import models.Series;
import models.Title;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args) {

        Movie movie01 = new Movie("About time", 2013);
        movie01.evaluates(10);
        Movie movie02 = new Movie("Aladdin", 2019);
        movie02.evaluates(9.5);
        Movie movie03 = new Movie("A Família Mitchell e a Revolta das Máquinas", 2021);
        movie03.evaluates(8);
        Series serie01 = new Series("Bones", 2005);

        ArrayList<Title> watchedList = new ArrayList<>();

        watchedList.add(movie01);
        watchedList.add(movie02);
        watchedList.add(movie03);
        watchedList.add(serie01);

        for (Title item : watchedList){
            System.out.println(item.getName());
            Movie movie = (Movie) item;
            System.out.println("Classificação: " + movie.getClassification());
        }
    }
}
