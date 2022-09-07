package designpattern.strategy.now.discount.Impl;

import designpattern.strategy.now.discount.AbstractDiscount;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:29
 */
public class NoDiscount extends AbstractDiscount {
    public NoDiscount() {
        super("对不起，该商品不参与优惠活动");
    }
    @Override
    public double discount(double price) {
        finalPrice = price;
        return finalPrice;
    }
}