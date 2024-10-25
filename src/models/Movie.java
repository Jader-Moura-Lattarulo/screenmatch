package models;
import calculations.Classifiable;

public class Movie extends Title implements Classifiable {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }
}
