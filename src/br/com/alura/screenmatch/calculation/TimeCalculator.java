package br.com.alura.screenmatch.calculation;

import br.com.alura.screenmatch.models.Titulo;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Titulo titulo){
        this.totalTime += titulo.getTimeInMin();
    }
}
