package designpattern.strategy.now.discount.Impl;

import designpattern.strategy.now.discount.AbstractDiscount;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:29
 */
public class Return5 extends AbstractDiscount {
    public Return5() {
        super("该商品可返现5元");
    }
    @Override
    public double discount(double price) {
        this.finalPrice = price >= 5 ? price - 5 : 0;
        return finalPrice;
    }
}