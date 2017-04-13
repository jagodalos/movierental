package pl.los;


import pl.los.exception.NoMovieFoundException;
import pl.los.model.Customer;
import pl.los.model.Movie;
import pl.los.model.Rent;
import pl.los.movierental.impl.InMemoryRental;

import java.util.Date;
import java.util.Scanner;

public class Main {

    private static InMemoryRental rental = new InMemoryRental();
    private static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) throws NoMovieFoundException, NoCustomerFoundException {


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
                case 5:
                    addNewCustomer();
                    break;
                case 6:
                    deleteCustomer();
                    break;
                case 7:
                    printAllCustomers();
                    break;
            }
        }
    }

    private static void printAllCustomers() {
        for (Customer c : rental.showAllCustomers()) {
            System.out.println(c);
        }
    }

    private static void deleteCustomer() throws NoCustomerFoundException {
        System.out.println("Please enter customer's id: ");
        int id = scr.nextInt();
        rental.deleteCustomer(id);
    }

    private static void addNewCustomer() {
        System.out.println("Name: ");
        String name = scr.nextLine();
        System.out.println("Surname: ");
        String surname = scr.nextLine();
        System.out.println("Pesel: ");
        String pesel = scr.nextLine();
        rental.addCustomer(new Customer(name, surname, pesel));
    }

    private static void printAllMovies() {
        for (Movie m : rental.showAllMovies())
            System.out.println(m);
    }

    private static void deleteMovie() throws NoMovieFoundException {
        System.out.println("Please enter movie's id: ");
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
        rental.addRent(new Rent( rental.getCustomer(customerId), rental.getMovie(movieId), new Date()));
    }

}

