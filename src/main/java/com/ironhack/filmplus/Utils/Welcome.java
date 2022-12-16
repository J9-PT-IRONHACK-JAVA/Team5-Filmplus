package com.ironhack.filmplus.Utils;

import com.ironhack.filmplus.Controller.FilmController;

import java.util.HashMap;
import java.util.Scanner;

public class Welcome {
    public static void login() {
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
            FilmController.loadMenu();
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
}
