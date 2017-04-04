package pl.los;


import pl.los.model.Movie;
import pl.los.model.Rent;
import pl.los.movierental.impl.InMemoryRental;

import java.util.Date;
import java.util.Scanner;

public class Main {

    private static InMemoryRental rental = new InMemoryRental();
    private static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            printMenu();
            int choice = scr.nextInt();
            cleanScanner();

            switch (choice) {

                case 0:
                    rentMovie();
                    break;
                case 1:
                    listAllRents();
                    break;
                case 2:
                    addNewMovie();
                    break;
                case 3:
                    deleteMovie();
                    break;
                case 4:
                    printAllMovies();
                    break;
            }
        }
    }

    private static void printAllMovies() {
        for (Movie m : rental.showAllMovies())
            System.out.println(m);
    }

    private static void deleteMovie() {
        System.out.println("Please enter model's id: ");
        int id = scr.nextInt();
        rental.deleteMovie(id);
    }

    private static void addNewMovie() {
        System.out.println("Title: ");
        String title = scr.nextLine();
        System.out.println("Director: ");
        String director = scr.nextLine();
        System.out.println("Duration: ");
        int duration = scr.nextInt();

        System.out.println("Price): ");
        double price = scr.nextInt();
        System.out.println("Number of movies available: ");
        int numberOfMovieAvailable = scr.nextInt();

        rental.addMovie(new Movie(title, director, duration, price, numberOfMovieAvailable));
    }

    private static void cleanScanner() {
        scr.nextLine();
    }

    private static void printMenu() {
        System.out.println("MOVIE RENTAL\n");
        System.out.println("Press 0 - Rent a Movie");
        System.out.println("Press 1 - Print the list of rented movies");
        System.out.println("Press 2 - Add new Movie");
        System.out.println("Press 3 - Delete Movie");
        System.out.println("Press 4 - Show All Movies");
        System.out.println("Press 5 - Add new Customer");
        System.out.println("Press 6 - Delete Customer");
        System.out.println("Press 7 - Show All Customers");
    }

    private static void listAllRents() {
        for (Rent r : rental.showAllRents()) {
            System.out.println(r);
        }
    }

    private static void rentMovie() {
        System.out.println("Enter model id: ");
        int movieId = scr.nextInt();
        System.out.println("Enter customer id: ");
        int customerId = scr.nextInt();
        System.out.println("Thank you !");
        rental.addRent(new Rent(movieId, customerId, new Date()));
    }

}

