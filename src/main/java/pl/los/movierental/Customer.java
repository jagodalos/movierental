package pl.los.movierental;

import lombok.*;

/**
 * Created by jagoda on 01.04.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
public class Customer {

    protected int id;
    protected String name;
    protected String surname;
    protected String pesel;
    protected  int nextId;

    public Customer(int id) {
        this.id = nextId++;
    }

    public static int getId(int id) {
        return id;
    }
}


