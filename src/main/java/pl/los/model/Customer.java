package pl.los.model;

import lombok.*;

/**
 * Created by jagoda on 01.04.2017.
 */
@ToString
public class Customer {

    private int id;
    private String name;
    private String surname;
    private String pesel;
    private int nextId;

    public Customer(int id, String name, String surname, String pesel, int nextId) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public int getNextId() {
        return nextId;
    }

    }







