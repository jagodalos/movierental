package pl.los.movierental;

import java.util.ArrayList;

/**
 * Created by jagod on 01.04.2017.
 */
public interface Rental {
    void addMovie(Movie movie);
    void deleteMovie(Movie movie);
    void showAllMovies();

    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    void showAllCustomers();

    void addRent(Rent rent);
    void deleteRent(Rent rent);
    ArrayList<Rent> showAllRents ();
}
