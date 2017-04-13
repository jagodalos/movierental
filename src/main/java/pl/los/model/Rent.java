package pl.los.model;

import lombok.ToString;
import pl.los.utils.DateUtil;

import java.util.Date;

/**
 * Created by jagod on 01.04.2017.
 */

@ToString
public class Rent {

    private Customer customer;
    private Movie movie;
    private Date rentalDate;
    private Date returnDate;

    public Rent(Customer customer, Movie movie, Date rentalDate) {
        this.customer = customer;
        this.movie = movie;
        this.rentalDate = rentalDate;
        this.returnDate = DateUtil.addDays(rentalDate, 7);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }


}

