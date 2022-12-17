package com.ironhack.filmplus.Controller;

import com.ironhack.filmplus.dto.FilmResults;
import com.ironhack.filmplus.dto.FilmResults;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "films", url = "https://api.themoviedb.org/3/")
public interface FilmProxy {

    @GetMapping("discover/movie")
    FilmResults getFilmsByPopularity(@RequestParam String api_key, @RequestParam String sort_by);
    @GetMapping("discover/movie")
    FilmResults getPopularFilmsByGenre(@RequestParam String api_key, @RequestParam String sort_by, @RequestParam int with_genres);









}
