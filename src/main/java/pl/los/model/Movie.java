package pl.los.model;

import lombok.*;

/**
 * Created by jagod on 01.04.2017.
 */

@ToString
public class Movie {
    private int id;
    private String title;
    private String director;
    private int duration;
    private double price;
    private int numberOfMovieAvailable;
    private static int nextId = 0;

    public Movie(String title, String director, int duration, double price, int numberOfMovieAvailable) {
        this.id = nextId++;
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.price = price;
        this.numberOfMovieAvailable = numberOfMovieAvailable;
    }



    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfMovieAvailable() {
        return numberOfMovieAvailable;
    }

    public int getNextId() {
        return nextId;
    }

    public boolean isAvailable() {
        return numberOfMovieAvailable > 0;
    }

}
