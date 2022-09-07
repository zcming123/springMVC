package designpattern.strategy.now.discount.Impl;

import designpattern.strategy.now.discount.AbstractDiscount;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:27
 */
public class Discount85 extends AbstractDiscount {

    public Discount85() {
        super("该商品可享受8.5折优惠");
    }
    @Override
    public double discount(double price) {
        finalPrice = price * 0.85;
        return finalPrice;
    }
}
