package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Sortable;

public class Film extends Titulo implements Sortable {
   private String diretor;

   public Film (){
   }

   public Film(String nome, int release){
       super(nome, release);
   }

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

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getRelease() + ")";
    }
}
