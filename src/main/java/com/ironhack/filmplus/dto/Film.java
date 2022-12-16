package com.ironhack.filmplus.dto;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class Film {
    private String movieId;
    private String movieName;
    private String description;

    public Film(String movieId, String name, String description) {
        this.movieId = movieId;
        this.movieName = name;
        this.description = description;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return movieName;
    }

    public void setName(String name) {
        this.movieName = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}

