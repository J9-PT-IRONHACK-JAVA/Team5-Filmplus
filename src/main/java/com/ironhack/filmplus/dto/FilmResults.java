package com.ironhack.filmplus.dto;

import lombok.Data;

import java.util.List;

@Data
    public class FilmResults{
        private List<Film> results;

//        public FilmResults(List<Film> results) {
//            this.results = results;
//        }
//
//        public List<Film> getResults() {
//            return results;
//        }
//
//        public void setResults(List<Film> results) {
//            this.results = results;
//        }
//



    }

    @Data
 class Film {
   // private int id;
    private String original_title;
   // private String title;
    // private String overview;

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

}


