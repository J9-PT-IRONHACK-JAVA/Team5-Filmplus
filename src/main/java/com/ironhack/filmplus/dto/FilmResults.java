package com.ironhack.filmplus.dto;

import lombok.Data;

import java.util.List;

@Data
public class FilmResults{
    private List<Film> results;
}

@Data
class Film {

    private String original_title;
    private String overview;
    private String original_language;
    private String title;
    private double rank;
    private String country;


    @Override
    public String toString() {
        return "Film:\n"
            + " Film title: " + title + "\n"
            + " Original title: " + original_title + "\n"
            + " Original language: " + original_language + "\n"
            + " Overview: " + overview + "\n"
            + "======================" + "\n";
    }

}


