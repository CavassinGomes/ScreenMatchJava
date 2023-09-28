package br.com.alura.screenmatch.models;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int release;
    private boolean inPlan;
    private double rating;
    private int numRatings;
    private int timeInMin;

    public Titulo(){

    }

    public Titulo(String name, int release) {
        this.name = name;
        this.release = release;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.name = meuTituloOmdb.title();
        this.release = Integer.valueOf(meuTituloOmdb.year());
        this.timeInMin = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public String getName() {
        return name;
    }

    public int getRelease() {
        return release;
    }

    public boolean isInPlan() {
        return inPlan;
    }

    public int getTimeInMin() {
        return timeInMin;
    }

    public int getNumRatings(){
        return numRatings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public void setInPlan(boolean inPlan) {
        this.inPlan = inPlan;
    }

    public void setTimeInMin(int timeInMin) {
        this.timeInMin = timeInMin;
    }

    public void showDataSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lancamento: " + release);
    }

    public void rate(double rates){
        rating += rates;
        numRatings ++;
    }
    public double average(){
        return rating / numRatings;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getName().compareTo(outroTitulo.getName());
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", release=" + release +
                ", runtime= " + timeInMin
                ;
    }
}
