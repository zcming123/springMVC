package designpattern.strategy.now.discount.Impl;

import designpattern.strategy.now.discount.AbstractDiscount;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:29
 */
public class Discount6 extends AbstractDiscount {
    public Discount6() {
        super("该商品可享受6折优惠");
    }
    @Override
    public double discount(double price) {
        finalPrice = price * 0.6;
        return finalPrice;
    }
}