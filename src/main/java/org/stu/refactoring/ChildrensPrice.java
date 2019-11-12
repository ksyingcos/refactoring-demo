package org.stu.refactoring;

/**
 * 儿童片价格
 *
 * @author ShiYing.Ke
 * @since 1.0.0
 */
public class ChildrensPrice extends Price {
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
