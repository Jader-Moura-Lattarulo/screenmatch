package br.com.alura.sreenmatch.models;

public class Movie {
    public String name;
    public int releaseYear;
    public boolean planIncluded;
    public int durationInMinutes;
    private int totalReviews;
    private double sumOfGrades;

    public void displaysTechnicalSheet() {
        System.out.println("*****************************");
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração: " + durationInMinutes + "min");
        System.out.println("Quantidade de valiações: " + totalReviews);
        System.out.println("Estrelas: " + getStars());
        System.out.println("*****************************");
    }

    public void evaluates(double grade) {
        sumOfGrades += grade;
        totalReviews ++;
    }

    public double getStars() {
        return (sumOfGrades / totalReviews) / 2;
    }

}
