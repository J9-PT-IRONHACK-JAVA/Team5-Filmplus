package com.ironhack.filmplus.dto;

import lombok.Data;

@Data
public class Film {

    private String original_title;
    private String overview;
    private String original_language;
    private String title;

    private double vote_average;
    private String country;
    private String genre;

}
