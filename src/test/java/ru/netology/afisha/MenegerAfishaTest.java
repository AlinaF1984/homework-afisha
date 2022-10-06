package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MenegerAfishaTest {


    @Test
    public void sequenceNumber() {
        MenegerAfisha meneger = new MenegerAfisha();


        meneger.addFilms("films1");
        meneger.addFilms("films2");
        meneger.addFilms("films3");
        meneger.addFilms("films4");
        meneger.addFilms("films5");
        meneger.addFilms("films6");
        meneger.addFilms("films7");
        meneger.addFilms("films8");
        meneger.addFilms("films9");
        meneger.addFilms("films10");


        String[] expected = {"films1", "films2", "films3", "films4", "films5", "films6", "films7", "films8", "films9", "films10"};
        String[] actual = meneger.getfilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mustShowNothing() {
        MenegerAfisha meneger = new MenegerAfisha(0);

        String[] expected = new String[0];
        String[] actual = meneger.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void mustShowValid() {
        MenegerAfisha meneger = new MenegerAfisha(4);


        meneger.addFilms("films1");
        meneger.addFilms("films2");
        meneger.addFilms("films3");
        meneger.addFilms("films4");
        meneger.addFilms("films5");
        meneger.addFilms("films6");
        meneger.addFilms("films7");
        meneger.addFilms("films8");
        meneger.addFilms("films9");
        meneger.addFilms("films10");

        meneger.findLast();


        String[] expected = {"films4", "films3", "films2", "films1"};
        String[] actual = meneger.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void mustShowOverMax() {
        MenegerAfisha meneger = new MenegerAfisha(10);

        meneger.addFilms("films1");
        meneger.addFilms("films2");
        meneger.addFilms("films3");
        meneger.addFilms("films4");
        meneger.addFilms("films5");
        meneger.addFilms("films6");
        meneger.addFilms("films7");
        meneger.addFilms("films8");
        meneger.addFilms("films9");
        meneger.addFilms("films10");

        String[] expected = {"films10", "films9", "films8", "films7", "films6", "films5", "films4", "films3", "films2", "films1"};
        String[] actual = meneger.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsAdd() {
        MenegerAfisha meneger = new MenegerAfisha();


        meneger.addFilms("films1");
        meneger.addFilms("films2");
        meneger.addFilms("films3");
        meneger.addFilms("films4");
        meneger.addFilms("films5");
        meneger.addFilms("films6");
        meneger.addFilms("films7");
        meneger.addFilms("films8");
        meneger.addFilms("films9");
        meneger.addFilms("films10");


        String[] expected = {"films1", "films2", "films3", "films4", "films5", "films6", "films7", "films8", "films9", "films10"};
        String[] actual = meneger.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
