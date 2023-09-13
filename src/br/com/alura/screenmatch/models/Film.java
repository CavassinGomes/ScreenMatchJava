package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Sortable;

public class Film extends Titulo implements Sortable {
   private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getRate() {
        return (int) average() / 2;
    }
}
