package pl.los.movierental.impl;

import lombok.*;
import pl.los.model.Customer;
import pl.los.model.Movie;
import pl.los.model.Rent;
import pl.los.movierental.Rental;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jagod on 01.04.2017.
 */
@ToString
public class InMemoryRental implements Rental {

    private ArrayList<Customer> customersList = new ArrayList<Customer>();
    private ArrayList<Movie> moviesList = new ArrayList<Movie>();
    private ArrayList<Rent> rentsList = new ArrayList<Rent>();

    public InMemoryRental() {
        Movie movie = new Movie("Intouchables", "Oliver Nakache", 133, 10, 3);
        Customer customer = new Customer(1, "John", "Black", "34567890", 0);
        Movie movie1 = new Movie("Saw", "James Wan", 103, 7, 1);
        Customer customer1 = new Customer(2, "Anna", "Black", "44567890", 0);
        Rent rent = new Rent(2, 2, new Date());
        moviesList.add(movie);
        moviesList.add(movie1);
        customersList.add(customer);
        customersList.add(customer1);
        rentsList.add(rent);
    }

    public Movie getMovie(int id){
        return moviesList.remove(id);
    }

    public void addMovie(Movie movie) {
        moviesList.add(movie);
    }

    public void deleteMovie(int id) {
        moviesList.remove(id);
    }

    public void addCustomer(Customer customer) {
        customersList.add(customer);
    }

    public void deleteCustomer(int id) {
        customersList.remove(id);
    }

    public void showAllCustomers() {
        for (Customer c : customersList) {
            System.out.println(c);
        }
    }

    public void addRent(Rent rent) {
        rentsList.add(rent);
    }

    public void deleteRent(Rent rent) {
        rentsList.remove(rent);
    }


    public ArrayList<Rent> showAllRents() {
        return rentsList;
    }

    public ArrayList<Movie> showAllMovies(){
        return moviesList;
    }
}





