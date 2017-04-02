package pl.los.movierental;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    private static InMemoryRental movies = new InMemoryRental();
    private static InMemoryRental customers = new InMemoryRental();
    private static InMemoryRental rents = new InMemoryRental();
    private static Movie category;
    private static Movie movie;
    private static Rent rent;
    private static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("MOVIE RENTAL");
        System.out.println("");
        System.out.println("Press 0 - Rent a Movie");
        System.out.println("Press 1 - Print the list of rented movies");
        System.out.println("Press 2 - Add new Movie");
        System.out.println("Press 3 - Delete Movie");
        System.out.println("Press 4 - Show All Movies");
        System.out.println("Press 5 - Add new Customer");
        System.out.println("Press 6 - Delete Customer");
        System.out.println("Press 7 - Show All Customers");

        while (true) {
        int choice = scr.nextInt();
        scr.hasNextLine();

            switch (choice) {

                case 0:
                    System.out.println("Enter movie id: ");
                    int movieId = scr.nextInt();
                    System.out.println("Enter customer id: ");
                    int customerId = scr.nextInt();
                    System.out.println("Enter today's date: ");
                    String rentalDate = scr.next();
                    System.out.println("Enter return's date: ");
                    String returnDate = scr.next();
//                   if (category.equals(Category.HORROR) || category.equals(Category.DRAMA)) {
//                       returnDate = "You have to return a movie within 7 days.";
//                   } else
//                       returnDate = "You have to return a movie within 10 days.";
                    System.out.println("Thank you !");
                    rents.addRent(new Rent(Movie.getId(movieId), Customer.getId(customerId), rentalDate, returnDate));
                    break;
                case 1:
                    for(Rent r : rents.showAllRents()){
                        System.out.println(r);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }


    }

}
