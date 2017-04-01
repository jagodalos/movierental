package pl.los.movierental;

import lombok.*;

/**
 * Created by jagod on 01.04.2017.
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie {
    private int id;
    private String title;
    private String director;
    private String duration;
    private Category category;
    private double price;
    private int numberOfMovieAvailable;

    public boolean isAvailable() {
        return numberOfMovieAvailable > 0;
    }
}
