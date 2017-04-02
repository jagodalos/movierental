package pl.los.movierental;

import lombok.*;

/**
 * Created by jagod on 01.04.2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Rent {

    protected int customerId;
    protected int movieId;
    protected String rentalDate;
    protected String returnDate = null;

    public String getReturnDate(String rentalDate) {
        return returnDate+7;
    }
}

