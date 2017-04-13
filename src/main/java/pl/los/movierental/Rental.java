package pl.los.movierental;

import pl.los.NoCustomerFoundException;
import pl.los.exception.NoMovieFoundException;
import pl.los.model.Customer;
import pl.los.model.Movie;
import pl.los.model.Rent;

import java.util.ArrayList;

/**
 * Created by jagod on 01.04.2017.
 */
public interface Rental {
    public void addMovie(Movie movie);
    public void deleteMovie(int id) throws NoMovieFoundException;
    public ArrayList<Movie> showAllMovies();

    public void addCustomer(Customer customer);
    public void deleteCustomer(int id) throws NoCustomerFoundException;
    public ArrayList<Customer> showAllCustomers();

    public void addRent(Rent rent);
    public void deleteRent(Rent rent);
    public ArrayList<Rent> showAllRents ();
}
