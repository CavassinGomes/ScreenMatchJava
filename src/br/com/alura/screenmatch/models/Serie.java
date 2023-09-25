package br.com.alura.screenmatch.models;

public class Serie extends Titulo{
    private int seasons;
    private boolean online;
    private int episodesBySeasons;
    private int minutesByEpisodes;

    public Serie(String name, int release) {
        super(name, release);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getEpisodesBySeasons() {
        return episodesBySeasons;
    }

    public void setEpisodesBySeasons(int episodesBySeasons) {
        this.episodesBySeasons = episodesBySeasons;
    }

    public int getMinutesByEpisodes() {
        return minutesByEpisodes;
    }

    public void setMinutesByEpisodes(int minutesByEpisodes) {
        this.minutesByEpisodes = minutesByEpisodes;
    }

    @Override
    public int getTimeInMin() {
        return seasons * episodesBySeasons * minutesByEpisodes;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getName() + "(" + this.getRelease() + ")";
    }
}
