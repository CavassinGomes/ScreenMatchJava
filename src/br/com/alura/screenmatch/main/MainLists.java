package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainLists {
    public static void main(String[] args) {
        Film myFilm = new Film("The GodFather", 1972);
        myFilm.rate(10);
        Film outroFilme = new Film("Avatar", 2023);
        outroFilme.rate(7);
        var filmP = new Film("Dogville", 2003);
        filmP.rate(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> list = new ArrayList<>();
        list.add(filmP);
        list.add(myFilm);
        list.add(outroFilme);
        list.add(lost);
        for (Titulo item: list) {
            System.out.println(item);
            if(item instanceof Film film && film.getRate() > 2){
                System.out.println("Classificação: " + film.getRate());
            }
        }

        ArrayList<String> findByArtist = new ArrayList<>();
        findByArtist.add("Adam Sandler");
        findByArtist.add("Paulo");
        findByArtist.add("Jaqueline");
        Collections.sort(findByArtist);
        System.out.println(findByArtist);
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Titulo::getRelease));
        System.out.println(list);
    }
}
