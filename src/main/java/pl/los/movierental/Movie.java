package pl.los.movierental;

import lombok.*;
import org.jetbrains.annotations.Contract;

/**
 * Created by jagod on 01.04.2017.
 */

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Movie {
    protected int id;
    protected String title;
    protected String director;
    protected String duration;
    protected Category category;
    protected double price;
    protected int numberOfMovieAvailable;
    protected static int nextId = 0;

    public Movie(int id) {
        this.id = nextId++;
    }

   public static int getId(int id) {
        return id;
    }

    public boolean isAvailable() {
        return numberOfMovieAvailable > 0;
    }
}
