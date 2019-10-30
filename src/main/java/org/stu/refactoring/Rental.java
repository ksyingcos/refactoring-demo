package org.stu.refactoring;

/**
 * 租赁，表示某个顾客租了一部影片
 *
 * @author ShiYing.Ke
 * @since 1.0.0
 */
public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    double getCharge() {
        double result = 0;
        // 算出每行的金额
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2)
                    result += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (getDaysRented() > 3)
                    result += (getDaysRented() - 3) * 1.5;
                break;
        }
        return result;
    }

    int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        // 添加常客积分
        frequentRenterPoints++;
        // 添加租赁超过两天新影片的额外积分
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
