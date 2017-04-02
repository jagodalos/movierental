package pl.los.movierental;

import lombok.*;

import java.util.ArrayList;

/**
 * Created by jagod on 01.04.2017.
 */
@Data
@Getter
@Setter
public class InMemoryRental implements Rental {

    private ArrayList<Customer> customersList = new ArrayList<Customer>();
    private ArrayList<Movie> moviesList = new ArrayList<Movie>();
    private ArrayList<Rent> rentsList = new ArrayList<Rent>();

    public InMemoryRental() {
        Movie movie = new Movie(1, "Intouchables", "Oliver Nakache", "133", Category.COMEDY, 10, 3);
        Customer customer = new Customer(1, "John", "Black", "34567890", 0);
        Movie movie1 = new Movie(2, "Saw", "James Wan", "103", Category.HORROR, 7, 1);
        Customer customer1 = new Customer(2, "Anna", "Black", "44567890", 0);
        Rent rent = new Rent(2, 2, "13.02.2017", "23.02.2017");
        moviesList.add(movie);
        moviesList.add(movie1);
        customersList.add(customer);

    }

    public void addMovie(Movie movie) {
        moviesList.add(movie);
    }

    public void deleteMovie(Movie movie) {
        moviesList.remove(movie);
    }

    public void showAllMovies() {
        for (Movie m : moviesList) {
            System.out.println(m);
        }
    }

    public void addCustomer(Customer customer) {
        customersList.add(customer);
    }

    public void deleteCustomer(Customer customer) {
        customersList.remove(customer);
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
}

//    public Movie getMovieId(int id) {
//        return moviesList.get(id);
//    }
//
//    public Customer getCustomerId(int id) {
//        return customersList.get(id);
//    }




