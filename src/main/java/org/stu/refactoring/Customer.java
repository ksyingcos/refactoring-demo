package org.stu.refactoring;

import java.util.Enumeration;
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

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints = getFrequentRenterPoints(frequentRenterPoints, each);


            // 显示每行租金金额
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";
            totalAmount += each.getCharge();
        }
        // 添加页脚，显示租金总额、积分
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points";
        return result;
    }

    private int getFrequentRenterPoints(int frequentRenterPoints, Rental each) {
        // 添加常客积分
        frequentRenterPoints++;
        // 添加租赁超过两天新影片的额外积分
        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                each.getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

}














