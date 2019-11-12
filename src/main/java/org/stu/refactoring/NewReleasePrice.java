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
}
