package pl.los.movierental;

import java.util.ArrayList;

/**
 * Created by jagod on 01.04.2017.
 */
public class InMemoryRental implements Rental {

    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<Rent> rents = new ArrayList<Rent>();

    public InMemoryRental() {
        
    }

    public void addMovie(Movie movie) {

    }

    public void deleteMovie(int id) {

    }

    public void showAllMovies() {

    }

    public void addCustomer(Customer customer) {

    }

    public void deleteCustomer(int id) {

    }

    public void showAllCustomers() {

    }

    public void addRent(Rent rent) {

    }

    public void deleteRent(int id) {

    }

    public void showAllRents() {

    }
}
