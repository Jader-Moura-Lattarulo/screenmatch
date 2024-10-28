package models;

public class Title {
    private String name;
    private int releaseYear;
    private boolean planIncluded;
    private int durationInMinutes;
    private int totalReviews;
    private double sumOfGrades;

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

}
