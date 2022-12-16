package com.ironhack.filmplus.Controller;

import com.ironhack.filmplus.dto.Film;
import com.ironhack.filmplus.dto.MovieLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.returnType;
import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

@RestController
@RequestMapping("/movies")
public class FilmController{
    public static void loadMenu() {

    var scanner = new Scanner(System.in);

        System.out.println("What do you want to do?\n\n");
        System.out.println("1. Check Overview");
        System.out.println("2. Check most popular films of 2022");
        System.out.println("1. List 2");
        System.out.println("3. Logout");

    var inputMenu = scanner.nextLine();
    int integerMenu = Integer.parseInt(inputMenu);
        if (integerMenu==1){
        System.out.println("Which movie do you want to check?");
        String inputMenuFilm = scanner.nextLine();
        //getMovieInfo(in)
    } else if (integerMenu==2){
      //  bestOfYear();
    } else if (integerMenu==3){
        System.exit(1);
    } else {
        System.out.println("");
    }

        scanner.close();
}

    @Value("${84875c710c9f3dd1f9968ca8436ba001}")
    private String apiKey;

 //   @Autowired
    public RestTemplate restTemplate;


    @RequestMapping("/{movieName}")
    public Film getMovieInfo(@PathVariable("movieName") String movieName) {
        MovieLibrary movieLibrary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + title + "?api_key=" +  apiKey, MovieLibrary.class);
        return new Film(movieName, movieLibrary.getTitle(), movieLibrary.getOverview());

    }

    @FeignClient(name = "bestOf", url = "https://api.themoviedb.org/discover/movie?sort_by=popularity.desc")
    public interface bestOfYear {
        @GetMapping("{rank}")
        Film rankFilms(@PathVariable String city);
    }
}
