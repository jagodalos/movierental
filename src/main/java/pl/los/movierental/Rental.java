package pl.los.movierental;

import pl.los.model.Customer;
import pl.los.model.Movie;
import pl.los.model.Rent;

import java.util.ArrayList;

/**
 * Created by jagod on 01.04.2017.
 */
public interface Rental {
    void addMovie(Movie movie);
    void deleteMovie(int id);
    ArrayList<Movie> showAllMovies();

    void addCustomer(Customer customer);
    void deleteCustomer(int id);
    void showAllCustomers();

    void addRent(Rent rent);
    void deleteRent(Rent rent);
    ArrayList<Rent> showAllRents ();
}
