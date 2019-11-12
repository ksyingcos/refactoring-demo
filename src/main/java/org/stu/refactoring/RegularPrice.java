package org.stu.refactoring;

/**
 * 普通片价格
 *
 * @author ShiYing.Ke
 * @since 1.0.0
 */
public class RegularPrice extends Price {
    int getPriceCode() {
        return Movie.REGULAR;
    }
}
