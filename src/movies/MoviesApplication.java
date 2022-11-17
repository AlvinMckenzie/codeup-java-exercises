package movies;


import util.Input;

import java.util.Scanner;

public class MoviesApplication {

    Input myInput = new Input(new Scanner(System.in));

public static int watch(){
    Input myInput = new Input(new Scanner(System.in));

    System.out.println("What would you like to do?");
    System.out.println("0 - exit");
    System.out.println("1 - view all movies");
    System.out.println("2 - view movies in the animated category");
    System.out.println("3 - view movies in the drama category");
    System.out.println("4 - view movies in the horror category");
    System.out.println("5 - view movies in the scifi category");
    System.out.println("6 - view movies in the musical category");
    System.out.println("7 - view movies in the comedy category");
    return myInput.getInt();
}

    public static void movieCat(){
        Input x = new Input(new Scanner(System.in));
        int y = watch();

        for (int i = 0; i < MoviesArray.findAll().length; i++){
            if (y == 0){

                break;

            } else if (y == 1) {System.out.println(MoviesArray.findAll()[i].getName());

            } else if (y == 2 && MoviesArray.findAll()[i].getCategory() == "animated") {  System.out.println(MoviesArray.findAll()[i].getName());

            } else if (y == 3 && MoviesArray.findAll()[i].getCategory() == "drama") {  System.out.println(MoviesArray.findAll()[i].getName());

            } else if (y == 4 && MoviesArray.findAll()[i].getCategory() == "horror") {  System.out.println(MoviesArray.findAll()[i].getName());

            } else if (y == 5 && MoviesArray.findAll()[i].getCategory() == "scifi") {  System.out.println(MoviesArray.findAll()[i].getName());

            } else if (y == 6 && MoviesArray.findAll()[i].getCategory() == "musical") {  System.out.println(MoviesArray.findAll()[i].getName());

            } else if (y == 7 && MoviesArray.findAll()[i].getCategory() == "comedy") {  System.out.println(MoviesArray.findAll()[i].getName());
            }
        }
        if (y == 0 ){

        }else {
        movieCat();}
    }

    public static void main(String[] args) {
    movieCat();

    }
}
