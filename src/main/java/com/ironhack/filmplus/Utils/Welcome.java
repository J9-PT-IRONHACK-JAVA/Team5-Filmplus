package com.ironhack.filmplus.Utils;

import com.ironhack.filmplus.Controller.FilmController;
import com.ironhack.filmplus.Controller.FilmProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
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

        var scanner = new Scanner(System.in);

        System.out.println("What do you want to do?\n\n");
        System.out.println("1. Check more popular films");
        System.out.println("2. Check best dramas");
        System.out.println("1. List 2");
        System.out.println("3. Logout");

        var inputMenu = scanner.nextLine();
        int integerMenu = Integer.parseInt(inputMenu);
        if (integerMenu==1){

            var popularFilms = filmProxy.getFilmsByPopularity();
            System.out.println(popularFilms);

        } else if (integerMenu==2){
        } else if (integerMenu==3){
            System.exit(1);
        } else {
            System.out.println("");
        }

        scanner.close();
    }
}
