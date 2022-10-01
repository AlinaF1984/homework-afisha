package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MenegerAfishaTest {

    Afisha films1 = new Afisha(1, "Bladshot", "http://", "actionMovie");
    Afisha films2 = new Afisha(2, "Ahead", "http://", "cartoon");
    Afisha films3 = new Afisha(3, "HotelBelgrad", "http://", "comedy");
    Afisha films4 = new Afisha(4, "Gentlemen", "http://", "actionMovie");
    Afisha films5 = new Afisha(5, "InvisibleMan", "http://", "horrors");
    Afisha films6 = new Afisha(6, "Trolls", "http://", "cartoon");
    Afisha films7 = new Afisha(7, "NumberOne", "http://", "comedy");
    Afisha films8 = new Afisha(8, "NumberTwo", "http://", "actionMovie");
    Afisha films9 = new Afisha(9, "NumberThree", "http://", "actionMovie");
    Afisha films10 = new Afisha(10, "NumberFour", "http://", "actionMovie");

    @Test
    public void sequenceNumber() {
        MenegerAfisha meneger = new MenegerAfisha();


        meneger.addFilms(films1);
        meneger.addFilms(films2);
        meneger.addFilms(films3);
        meneger.addFilms(films4);
        meneger.addFilms(films5);
        meneger.addFilms(films6);
        meneger.addFilms(films7);
        meneger.addFilms(films8);
        meneger.addFilms(films9);
        meneger.addFilms(films10);


        Afisha[] expected = {films1, films2, films3, films4, films5, films6, films7, films8, films9, films10};
        Afisha[] actual = meneger.getfilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mustShowNothing() {
        MenegerAfisha meneger = new MenegerAfisha(0);

        Afisha[] expected = new Afisha[0];
        Afisha[] actual = meneger.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void mustShowValid() {
        MenegerAfisha meneger = new MenegerAfisha(4);


        meneger.addFilms(films1);
        meneger.addFilms(films2);
        meneger.addFilms(films3);
        meneger.addFilms(films4);
        meneger.addFilms(films5);
        meneger.addFilms(films6);
        meneger.addFilms(films7);
        meneger.addFilms(films8);
        meneger.addFilms(films9);
        meneger.addFilms(films10);

        Afisha filmsadd = new Afisha(11, "NumberFive", "http://", "horrors");
        meneger.addFilms(filmsadd);


        Afisha[] expected = {new Afisha(11, "NumberFive", "http://", "horrors"), films10, films9, films8};
        Afisha[] actual = meneger.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void mustShowOverMax() {
        MenegerAfisha meneger = new MenegerAfisha(11);

        meneger.addFilms(films1);
        meneger.addFilms(films2);
        meneger.addFilms(films3);
        meneger.addFilms(films4);
        meneger.addFilms(films5);
        meneger.addFilms(films6);
        meneger.addFilms(films7);
        meneger.addFilms(films8);
        meneger.addFilms(films9);
        meneger.addFilms(films10);

        Afisha[] expected = {films10, films9, films8, films7, films6, films5, films4, films3, films2, films1};
        Afisha[] actual = meneger.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
