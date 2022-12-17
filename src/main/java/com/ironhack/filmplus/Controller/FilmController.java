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

    // @Autowired
    private final FilmProxy filmProxy;

    //@Bean  para poder hacer inyecciones de dependencias


//    @Value("${84875c710c9f3dd1f9968ca8436ba001}")
////    private static String apiKey;
//    private  String apiKey;

 //   @Autowired
    public  RestTemplate restTemplate;
   // public static RestTemplate restTemplate;


//    @RequestMapping("/{movieName}")
//    public Film getMovieInfo(@PathVariable("movieName") String movieName) {
//        MovieLibrary movieLibrary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + title + "?api_key=" +  apiKey, MovieLibrary.class);
//       // return new Film(movieName, movieLibrary.getTitle(), movieLibrary.getOverview());
//
//    }

//    @FeignClient(name = "bestOf", url = "https://api.themoviedb.org/discover/movie?sort_by=popularity.desc")
//    public interface bestOfYear {
//        @GetMapping("{rank}")
//        FilmResults rankFilms(@PathVariable String city);
//    }

    @GetMapping("/popular")
    public FilmResults getFilms(){
        return filmProxy.getFilmsByPopularity();
    }

   // @GetMapping("/discover/movie?sort_by=popularity.desc")
  //  public static String getFilmByPopularity(){
//        String url = "http://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc";
//        MovieLibrary movieLibrary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/100?api_key=84875c710c9f3dd1f9968ca8436ba001", MovieLibrary.class);
//        return movieLibrary.toString();
//    }

//        @RequestMapping(value = "/redirect", method = RequestMethod.GET)
//        public void method(HttpServletResponse httpServletResponse) {
//            httpServletResponse.setHeader("Location", projectUrl);
//            httpServletResponse.setStatus(302);
//        }

//        @RequestMapping(value = "/movie?sort_by=popularity.desc", method = RequestMethod.GET)
//        public String method() {
//            return new String("/movie?sort_by=popularity.desc" + "http://api.themoviedb.org/3/discover");
//        }

//    @RequestMapping("")
//    public static RedirectView localRedirect() {
//        RedirectView redirectView = new RedirectView();
//        redirectView.setUrl("http://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc");
//        System.out.println(redirectView.toString());
//        return redirectView;
//    }

}
