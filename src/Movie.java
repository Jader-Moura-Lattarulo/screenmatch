public class Movie {
    String name;
    int releaseYear;
    boolean planIncluded;
    int durationInMinutes;
    int totalReviews;
    double sumOfGrades;

    void displaysTechnicalSheet() {
        System.out.println("*****************************");
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração: " + durationInMinutes + "min");
        System.out.println("Quantidade de valiações: " + totalReviews);
        System.out.println("Estrelas: " + getStars());
        System.out.println("*****************************");
    }

    void evaluates(double grade) {
        sumOfGrades += grade;
        totalReviews ++;
    }

    double getStars() {
        return (sumOfGrades / totalReviews) / 2;
    }

}
