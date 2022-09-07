package designpattern.strategy.now;

import designpattern.strategy.now.discount.AbstractDiscount;

import java.text.MessageFormat;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:25
 */
public class BuyGoods {
    private String goods;
    private double price;
    private AbstractDiscount abstractDiscount;
    public BuyGoods(String goods, double price, AbstractDiscount
            abstractDiscount) {
        this.goods = goods;
        this.price = price;
        this.abstractDiscount = abstractDiscount;
    }
    public double calculate() {
        double finalPrice = abstractDiscount.discount(this.price);
        String desc = abstractDiscount.getDesc();
        System.out.println(MessageFormat.format("商品：{0}，原价：{1}，{2}，最终价格为：{3}", goods, price, desc, finalPrice));
        return finalPrice;
    }
}
