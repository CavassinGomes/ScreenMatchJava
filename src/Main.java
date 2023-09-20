import br.com.alura.screenmatch.calculation.Recommendation;
import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film("The GodFather", 1972);
        myFilm.setName("The GodFather");
        myFilm.setRelease(1972);
        myFilm.setTimeInMin(175);

        myFilm.showDataSheet();

        myFilm.rate(8);
        myFilm.rate(5);
        myFilm.rate(9);

        System.out.println("Total de avaliações: " + myFilm.getNumRatings());
        System.out.println(myFilm.average());

        Serie lost = new Serie("Lost", 2000);
        lost.showDataSheet();
        lost.setSeasons(10);
        lost.setEpisodesBySeasons(10);
        lost.setMinutesByEpisodes(50);
        System.out.println("Duração total do filme: " + lost.getTimeInMin());

        Film outroFilme = new Film();
        outroFilme.setName("Avatar");
        outroFilme.setRelease(2023);
        outroFilme.setTimeInMin(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm);
        calculator.include(outroFilme);
        calculator.include(lost);
        System.out.println(calculator.getTotalTime());

        Recommendation filter = new Recommendation();
        filter.filter(myFilm);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViews(300);
        filter.filter(episode);

        var filmP = new Film("Dogville", 2003);
        filmP.setTimeInMin(200);
        filmP.rate(10);

        ArrayList<Film> filmList = new ArrayList<>();
        filmList.add(filmP);
        filmList.add(myFilm);
        filmList.add(outroFilme);
        System.out.println("Tamanho da lista: " + filmList.size());
        System.out.println("Primeiro filme: " + filmList.get(0).getName());
        System.out.println("toString do filme: " + filmList.toString());



    }
}
