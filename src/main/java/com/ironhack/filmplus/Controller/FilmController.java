package com.ironhack.filmplus.Controller;


import com.ironhack.filmplus.dto.FilmResults;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class FilmController{

    private final FilmProxy filmProxy;
    public  RestTemplate restTemplate;

    @GetMapping("/popular")
    public FilmResults getFilms(){
        return filmProxy.getFilmsByPopularity();
    }

}
