package org.stu.refactoring;

/**
 * 价格抽象类
 *
 * @author ShiYing.Ke
 * @since 1.0.0
 */
public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
