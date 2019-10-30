package org.stu.refactoring;

import java.util.Vector;

/**
 * 顾客
 *
 * @author ShiYing.Ke
 * @since 1.0.0
 */
public class Customer {

    private String name;
    private Vector<Rental> rentals = new Vector<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        this.rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }
}
