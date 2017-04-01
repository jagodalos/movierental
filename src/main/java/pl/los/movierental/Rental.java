package pl.los.movierental;

/**
 * Created by jagod on 01.04.2017.
 */
public interface Rental {
    void addMovie(Movie movie);
    void deleteMovie(int id);
    void showAllMovies();

    void addCustomer(Customer customer);
    void deleteCustomer(int id);
    void showAllCustomers();

    void addRent(Rent rent);
    void deleteRent(int id);
    void showAllRents();
}
