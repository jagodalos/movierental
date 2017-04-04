package pl.los.model;

import lombok.ToString;
import pl.los.utils.DateUtil;

import java.util.Date;

/**
 * Created by jagod on 01.04.2017.
 */

@ToString
public class Rent {

    private int customerId;
    private int movieId;
    private Date rentalDate;
    private Date returnDate;

    public Rent(int customerId, int movieId, Date rentalDate) {
        this.customerId = customerId;
        this.movieId = movieId;
        this.rentalDate = new Date();
        this.returnDate = DateUtil.addDays(rentalDate, 7);
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getMovieId() {
        return movieId;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }


}

