package calculations;
import models.Movie;
import models.Series;
import models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void includes(Movie m){
//        this.totalTime += m.getDurationInMinutes();
//    }
//
//    public void includes(Series s){
//        this.totalTime += s.getDurationInMinutes();
//    }

    public void includes(Title t) {
        System.out.println("Adicionando duração em minutos de " + t);
        this.totalTime += t.getDurationInMinutes();
    }
}
