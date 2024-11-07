package models;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseYear;
    private boolean planIncluded;
    private int durationInMinutes;
    private int totalReviews;
    private double sumOfGrades;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(OmdbTitle myTitleOmdb) {
        this.name = myTitleOmdb.title();
        this.releaseYear = Integer.valueOf(myTitleOmdb.year());
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0, 2));
    }

    //public void displaysTechnicalSheet() {
    //    System.out.println("*****************************");
    //    System.out.println("Nome do Filme: " + name);
    //    System.out.println("Ano de lançamento: " + releaseYear);
    //    System.out.println("Duração: " + durationInMinutes + "min");
    //    System.out.println("Quantidade de valiações: " + totalReviews);
    //    System.out.println("Estrelas: " + getAverage());
    //    System.out.println("*****************************");
    //}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void evaluates(double grade) {
        sumOfGrades += grade;
        totalReviews ++;
    }

    public double getAverage() {
        return sumOfGrades / totalReviews;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "Title{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", duration=" + durationInMinutes +
                '}';
    }
}
