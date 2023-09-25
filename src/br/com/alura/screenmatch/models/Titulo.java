package br.com.alura.screenmatch.models;

public class Titulo implements Comparable<Titulo>{
    private String name;
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
}
