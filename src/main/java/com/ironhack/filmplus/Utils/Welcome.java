package com.ironhack.filmplus.Utils;

import com.ironhack.filmplus.Controller.FilmProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Scanner;
@Component
@RequiredArgsConstructor
public class Welcome {

    private final FilmProxy filmProxy;

    public void login() {
        System.out.println("\n\nTo access, first insert your credentials \n \n");
        System.out.println("What's your name?");

        var users = new HashMap<String, String>();
        var scanner = new Scanner(System.in);

        users.put("user", "pepe");
        users.put("admin", "dri");

        int tryNumber = 2;
        var inputName = scanner.nextLine();
        System.out.println("Enter your password");
        var inputPass = scanner.nextLine();

        if (users.containsKey(inputName) && users.get(inputName).equals(inputPass)) {
            System.out.println("You can enter! Welcome " + inputName);
            com.ironhack.filmplus.Utils.Banners.cleanScreen();
            loadMenu();
        } else if (!users.containsValue(inputName) || !users.containsKey(inputName) || !users.get(inputName).equals(inputPass)) {
            do {
                tryNumber = tryNumber - 1;
                System.out.println("Incorrect password. You have " + tryNumber + " tries left");
                inputPass = scanner.nextLine();
            } while (tryNumber > 0);
            System.out.println("Incorrect credentials. Closing program");
            System.exit(0);
            scanner.close();
        }
    }

    public  void loadMenu() {

        var apiKey = "84875c710c9f3dd1f9968ca8436ba001";
        var sortBy = "popularity.desc";


        var scanner = new Scanner(System.in);


        System.out.println("What do you want to do?\n\n");
        System.out.println("1. Check more popular films");
        System.out.println("2. Check more popular drama films");
        System.out.println("3. Check more popular drama films");
        System.out.println("4. Logout"); //OK


        var inputMenu = scanner.nextLine();
        int integerMenu = Integer.parseInt(inputMenu);
        if (integerMenu==1){
            var popularFilms = filmProxy.getFilmsByPopularity(apiKey,sortBy);
            for (int i = 0; i < 10; i++) {
                var film = popularFilms.getResults().get(i);
                System.out.println("Film name: " + film.getTitle());
                System.out.println("Original language: " +film.getOriginal_language());
                System.out.println("Overview: "+ film.getOverview());
            }
        } else if (integerMenu==2){
            var popularFilmByGenre = filmProxy.getPopularFilmsByGenre(apiKey,sortBy,16);
            for (int i = 0; i < 10; i++) {
                var film = popularFilmByGenre.getResults().get(i);
                System.out.println("Genre: "+ film.getGenre());
                System.out.println("Film title: "+film.getTitle());
                System.out.println("Rank: "+film.getVoteAverage());
            }
        } else if (integerMenu==3){
            var popularFilmByGenre = filmProxy.getPopularFilmsByGenre(apiKey,sortBy,16);
            for (int i = 0; i < 10; i++) {
                var film = popularFilmByGenre.getResults().get(i);
                System.out.println("Genre: "+ film.getGenre());
                System.out.println("Film title: "+film.getTitle());
                System.out.println("Rank: "+film.getVoteAverage());
            }
            System.exit(1);
        } else {
            System.out.println("");
        }

        scanner.close();
    }
}
