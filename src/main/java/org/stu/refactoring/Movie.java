package org.stu.refactoring;

/**
 * 影片数据类
 *
 * @author ShiYing.Ke
 * @since 1.0.0
 */
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    double getCharge(int daysRented) {
        double result = 0;
        // 算出每行的金额
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

    int getFrequentRenterPoints(int daysRented) {
        // 租赁超过两天新影片的额外积分
        if ((getPriceCode() == Movie.NEW_RELEASE) &&
                daysRented > 1)
            return 2;
        return 1;
    }
}
