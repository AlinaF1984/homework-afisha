package ru.netology.afisha;

import lombok.Data;

@Data

public class MenegerAfisha {
    private Afisha[] films = new Afisha[0];
    private int defaultFilmsLength = 10;


    MenegerAfisha() {

    }

    public MenegerAfisha(int customFilmsLength) {
        if (customFilmsLength > 0) {
            defaultFilmsLength = customFilmsLength;
        }
    }

    public Afisha[] findAll() {
        return films;
    }

    public void addFilms(Afisha film) {
        int length = films.length + 1;
        Afisha[] movie = new Afisha[length];
        System.arraycopy(films, 0, movie, 0, films.length);
        int lastFilm = movie.length - 1;
        movie[lastFilm] = film;
        films = movie;
    }

    public Afisha[] getfilms() {
        return films;
    }

    public Afisha[] findLast() {
        int moviesLength = films.length;
        if (moviesLength < defaultFilmsLength) {
            defaultFilmsLength = moviesLength;
        }
        Afisha[] customFilm = new Afisha[defaultFilmsLength];
        for (int i = 0; i < customFilm.length; i++) {
            int result = moviesLength - i - 1;
            customFilm[i] = films[result];
        }
        return customFilm;
    }

}

