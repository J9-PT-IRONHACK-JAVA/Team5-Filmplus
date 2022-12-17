package com.ironhack.filmplus.Controller;

import com.ironhack.filmplus.dto.FilmResults;
import com.ironhack.filmplus.dto.FilmResults;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "films", url = "https://api.themoviedb.org/3/")
public interface FilmProxy {

    @GetMapping("discover/movie?api_key=84875c710c9f3dd1f9968ca8436ba001&sort_by=popularity.desc")
    FilmResults getFilmsByPopularity();

}
