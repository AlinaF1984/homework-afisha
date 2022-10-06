package ru.netology.afisha;

public class MenegerAfisha {
    private String[] films = new String[0];
    private int defaultFilmsLength;


    public MenegerAfisha() {
        this.defaultFilmsLength = 10;
    }


    public MenegerAfisha(int defaultFilmsLength) {
        this.defaultFilmsLength = defaultFilmsLength;
    }


    public String[] findAll() {
        return films;
    }

    public void addFilms(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] getfilms() {
        return films;
    }

    public String[] findLast() {
        int moviesLength;
        if (films.length < defaultFilmsLength) {
            moviesLength = films.length;
        } else {
            moviesLength = defaultFilmsLength;
        }
        String[] customFilm = new String[defaultFilmsLength];
        for (int i = 0; i < customFilm.length; i++) {
            int result = moviesLength - i - 1;
            customFilm[i] = films[result];
        }
        return customFilm;
    }

}

