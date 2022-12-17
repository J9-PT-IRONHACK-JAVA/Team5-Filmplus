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

//    public Film(int id, String original_title, String overview) {
//        this.id = id;
//        this.original_title = original_title;
//        this.overview = overview;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return original_title;
//    }
//
//    public void setName(String original_title) {
//        this.original_title = original_title;
//    }
//
//    public String getOverview() {
//        return overview;
//    }
//
//    public void setOverview(String overview) {
//        this.overview = overview;
//    }
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


