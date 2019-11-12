package org.stu.refactoring;

/**
 * 新片价格
 *
 * @author ShiYing.Ke
 * @since 1.0.0
 */
public class NewReleasePrice extends Price {
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    /**
     * 租赁超过两天新影片的额外积分
     *
     * @param daysRented
     * @return
     */
    @Override
    int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
